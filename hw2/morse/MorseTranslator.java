// What strategy you used to store the morse code encoding table and WHY?

/* I used a switch statement to store the morse code encoding table. This is because
 * the switch statement allows me to have an organized table that I can call at
 * any time to translate the code letter by letter. It also has an easy to use default to
 * prevent bugs, since if someone inputs invalid code the program will just default to a space
 * (this could be expanded upon to input an error message instead but I chose not to do that
 * for the assignment purposes).
 * 
 * The switch is also very readable and easy to adjust if necessary.
*/

package edu.albany.hw2.morse;

public class MorseTranslator {

	//This method is the primary converter for Morse code to English
	//When taking in an input from the user all letters are separated by spaces
	//While all words are separated by a slash (/)
	//This method uses a switch to convert characters from Morse to English/punctuation/numbers
	//It finds a match and then returns the converted String
	private static String Translate(String morseChar) {
		 switch (morseChar) {
		 case ".-":
			 return "a";
		 case "-...":
			 return "b";
		 case "-.-.":
			 return "c";
		 case "-..":
			 return "d";
		 case ".":
			 return "e";
		 case "..-.":
			 return "f";
		 case "--.":
			 return "g";
		 case "....":
			 return "h";
		 case "..":
			 return "i";
		 case ".---":
			 return "j";
		 case "-.-":
			 return "k";
		 case ".-..":
			 return "l";
		 case "--":
			 return "m";
		 case "-.":
			 return "n";
		 case "---":
			 return "o";
		 case ".--.":
			 return "p";
		 case "--.-":
			 return "q";
		 case ".-.":
			 return "r";
		 case "...":
			 return "s";
		 case "-":
			 return "t";
		 case "..-":
			 return "u";
		 case "...-":
			 return "v";
		 case ".--":
			 return "w";
		 case "-..-":
			 return "x";
		 case "-.--":
			 return "y";
		 case "--..":
			 return "z";
		 case "--..--":
			 return ",";
		 case ".-.-.-":
			 return ".";
		 case ".----":
			 return "1";
		 case "..---":
			 return "2";
		 case "...--":
			 return "3";
		 case "....-":
			 return "4";
		 case ".....":
			 return "5";
		 case "-....":
			 return "6";
		 case "--...":
			 return "7";
		 case "---..":
			 return "8";
		 case "----.":
			 return "9";
		 case "-----":
			 return "0";
		 case "/":
			 return " ";
		 case " ":
			 return " ";
			 
		 default: 
			 return "";
		 }
	}
	//This method splits our user inputted String and prints out the translated version
	public static void Convert(String morseCode) {
		//First we split our code by spaces, leaving us with an array
		//Each element in the array is either a letter, punctuation mark, number, or word seperator
		String[] split = morseCode.split(" ");
		for (int i = 0; i< split.length; i++) {
			//If we find a slash we output a space
			if (split[i].equals("/")) {
				System.out.print(" ");
			}
			//Otherwise we lookup the code in our translator and output the match
			else {
				System.out.print(Translate(split[i]));
			}
			
		}
		System.out.println();
	}
}
