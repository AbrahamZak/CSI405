import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

//A simple grep application in Java, ran single threaded and multi threaded with speeds compared
//Usage: grep 'word to find' path1... [path...]
//Arguments used in testing: complement /Users/ayevdayev/CSI405/hw4/complementable/BinaryWord.java /Users/ayevdayev/CSI405/hw4/complementable/Complementable.java
public class Grep {

	public static void main(String[] args) {
		System.out.println("Time with original grep in terminal: 0m0.007s");
		//Count the time of execution for single thread and run grep
		System.out.println("Now running single threaded grep...");
		long startTime = System.nanoTime();
		grep(args);
		final long duration = System.nanoTime() - startTime;
		System.out.println("Execution time with single thread: " + duration);
		System.out.println("Now running multi threaded grep...");
		//Count the time of execution for multi thread and run grep
		long startTime2 = System.nanoTime();
		grepMultiThread(args);
		final long duration2 = System.nanoTime() - startTime2;
		System.out.println("Execution time with multi thread: " + duration2);
	}
	
	//Method for grep command, takes in args
	public static void grep(String[] args) {
		//Boolean to skip the first term in args which is the search term
		Boolean searchTerm = false;
	      for (String i : args) {
	    	  if (searchTerm==false) {
	    		  searchTerm = true;
	    		  continue;
	    	  }
	    	  //Print the current directory
	    	  System.out.println(i);
	    	  Pattern pat = null;    
	    	  //Make a pattern with the search term
		        try {
		            pat = Pattern.compile(args[0]);
		        } catch (PatternSyntaxException e) {
		            System.err.println("Invalid RE syntax: " + e.getDescription());
		            System.exit(1);
		        }
		        //Open the file
		        BufferedReader in = null;
		        try {
		            in = new BufferedReader(new InputStreamReader(
		                 new FileInputStream(i)));
		        } catch (FileNotFoundException e) {
		            System.err.println("Unable to open file " +
		                i + ": " + e.getMessage());
		            System.exit(1);
		        }

		        //Search the file for the search term and also record and print the line numbers with the found lines
		        try {
		            String s;
		            int line = 0;
		            while ((s = in.readLine()) != null) {
		             	line++;
		                Matcher m = pat.matcher(s);
		                if (m.find())
		                    System.out.println(line + ": " + s);
		            }
		        } catch (Exception e) {
		            System.err.println("Error reading line: " + e.getMessage());
		            System.exit(1);
		        }
	      }     
	    }
	public static void grepMultiThread(String[] args) {
		//Boolean to skip the first term in args which is the search term, set the search term to pattern String
				Boolean searchTerm = false;
				String pattern = null;
			      for (String i : args) {
			    	  if (searchTerm==false) {
			    		  pattern = i;
			    		  searchTerm = true;
			    		  continue;
			    	  }
			    	//Print the current directory
			    	  System.out.println(i);
			    	  int lines = lines(i);
			    	  int startEnd = (lines/2);
			    	  
			    	  //Create an executor and 2 workers
			    	  ExecutorService executor = Executors.newFixedThreadPool(2);
			    	  
			    	  //One workers holds the info for the first half of the file,
			    	  //the other worker holds the info for the second half of the file
			    	  Callable<ArrayList<String>> worker = new MyCallable(i, pattern, 0, startEnd);
			    	  Callable<ArrayList<String>> worker2 = new MyCallable(i, pattern, startEnd, lines);
			    	  
			    	  
			    	  //Run the workers and store the results in Futures
			    	  Future <ArrayList<String>> future = executor.submit(worker);
			    	  Future <ArrayList<String>> future2 =  executor.submit(worker2);
			    	  
			    	  //Shutdown when complete
			    	  executor.shutdown();
			  		while (!executor.isTerminated()) {
			  		}
			  		
			  		//Now get the results from the futures and store them into Arraylists
			  		//Then print those Arraylists in the correct order, first half then second half
			  		try {
						ArrayList<String> results = future.get();
						for (String s: results) {
				  			System.out.println(s);
				  		}
					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (ExecutionException e) {
						e.printStackTrace();
					}
			  		
			  		try {
						ArrayList<String> results2 = future2.get();
						for (String s: results2) {
				  			System.out.println(s);
				  		}
					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (ExecutionException e) {
						e.printStackTrace();
					}
			  		
			  		
			      }
	}

	/**In this version of grep we store results in an arraylist and return it
	We do this because we need to print the arraylists in order because the parallel
	processes are running for top and bottom half of the file at the same time **/
	public static ArrayList<String> grepMultiThreadExecute (String file, String pattern, int begin, int end) {
		ArrayList<String> results = new ArrayList<String>(); 
		Pattern pat = null;    
   	  //Make a pattern with the search term
	        try {
	            pat = Pattern.compile(pattern);
	        } catch (PatternSyntaxException e) {
	            System.err.println("Invalid RE syntax: " + e.getDescription());
	            System.exit(1);
	        }
	        //Open the file
	        BufferedReader in = null;
	        try {
	            in = new BufferedReader(new InputStreamReader(
	                 new FileInputStream(file)));
	        } catch (FileNotFoundException e) {
	            System.err.println("Unable to open file " +
	                file + ": " + e.getMessage());
	            System.exit(1);
	        }

	        //Search the file for the search term and also record and print the line numbers with the found lines
	        try {
	            String s;
	            String res = null;
	            int line = 0;
	            
	            while ((s = in.readLine()) != null) {
	            	if (line<begin) {
	            		line++;
	            		continue;
	            	}
	             	line++;
	                Matcher m = pat.matcher(s);
	                if (m.find()) {
	                	res = (line + ": " + s);
	                	results.add(res);
	                }
	                if (line==end) {
	                	break;
	                }
	            }
	        } catch (Exception e) {
	            System.err.println("Error reading line: " + e.getMessage());
	            System.exit(1);
	        }
	        //Return the results
			return results;
     }     
	
	//Method that returns the total number of lines in an input file
	private static int lines(String file) {
		int lineCount = 0;
try{
    		FileReader fr = new FileReader(file);
    		    LineNumberReader lnr = new LineNumberReader(fr);
    		    while (lnr.readLine() != null){
    		    	lineCount++;
    	            }
    	            lnr.close();     
    		} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
return lineCount;

		
	}
	
	//MyRunnable class that implements Runnable for multithreading
	public static class MyCallable implements Callable <ArrayList<String>> {
		private String file;
		private String pattern;
		private int start;
		private int end;
 
		public MyCallable(String file, String pattern, int start, int end) {
			this.file = file;
			this.pattern = pattern;
			this.start = start;
			this.end = end;
		}
 
		//The run method runs the grepMultiThreadExecute
		public ArrayList<String> call() {
			return grepMultiThreadExecute(file, pattern, start, end);
		}
	}
	
}
