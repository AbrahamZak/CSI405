// What strategy you used to store the morse code encoding table and WHY?

/* I used a switch statement to store the morse code encoding table. This is because
 * the switch statement allows me to have an organized table that I can call at
 * any time to translate to code letter by letter. It also has an easy to use default to
 * prevent bugs, since if someone inputs invalid code the program will just default to a space
 * (this could be expanded upon to input an error message instead but I chose not to do that
 * for the assignment purposes).
 * 
 * The switch is also very readable and easy to adjust if necessary.
*/

package edu.albany.hw2.textToMorse;

//Program to translate user inputted text to morse code
public class MorseTranslator {

	//This method is the primary converter for English to morse
	//This method uses a switch to convert characters from English/punctuation/numbers to Morse 
	//It finds a match and then returns the converted String
	private static String Translate(char morseChar) {
		 switch (morseChar) {
		 case 'a':
			 return ".-";
		 case 'b':
			 return "-...";
		 case 'c':
			 return "-.-.";
		 case 'd':
			 return "-..";
		 case 'e':
			 return ".";
		 case 'f':
			 return "..-.";
		 case 'g':
			 return "--.";
		 case 'h':
			 return "....";
		 case 'i':
			 return "..";
		 case 'j':
			 return ".---";
		 case 'k':
			 return "-.-";
		 case 'l':
			 return ".-..";
		 case 'm':
			 return "--";
		 case 'n':
			 return "-.";
		 case 'o':
			 return "---";
		 case 'p':
			 return ".--.";
		 case 'q':
			 return "--.-";
		 case 'r':
			 return ".-.";
		 case 's':
			 return "...";
		 case 't':
			 return "-";
		 case 'u':
			 return "..-";
		 case 'v':
			 return "...-";
		 case 'w':
			 return ".--";
		 case 'x':
			 return "-..-";
		 case 'y':
			 return "-.--";
		 case 'z':
			 return "--..";
		 case ',':
			 return "--..--";
		 case '.':
			 return ".-.-.-";
		 case '1':
			 return ".----";
		 case '2':
			 return "..---";
		 case '3':
			 return "...--";
		 case '4':
			 return "....-";
		 case '5':
			 return ".....";
		 case '6':
			 return "-....";
		 case '7':
			 return "--...";
		 case '8':
			 return "---..";
		 case '9':
			 return "----.";
		 case '0':
			 return "-----";
			
		 default: 
			 return "";
		 }
	}
	//This method splits our user inputed String and prints out the translated version
	public static void Convert(String morseCode) {
		//First we split the string into a char array
		char[] split=morseCode.toCharArray(); 
		for (int i = 0; i< split.length; i++) {
			//If we find a space we output a slash to separate words
			if (split[i]==' ') {
				System.out.print(" / ");
			}
			//Otherwise we lookup the code in our translator and output the match and a space
			else {
				System.out.print(Translate(Character.toLowerCase(split[i])));
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
}
