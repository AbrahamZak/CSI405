package edu.albany.hw2.morse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMorse {

	public static void main(String[] args) throws IOException {
		//This is our morse string test, it says: "This is a simple, yet challenging cache."
		//String morseTest = ("- .... .. ... / .. ... / .- / ... .. -- .--. .-.. . --..-- / -.-- . - / -.-. .... .- .-.. .-.. . -. --. .. -. --. / -.-. .- -.-. .... . .-.-.-");
		//MorseTranslator.Convert(morseTest);
		
		//Now we ask the user to provide their own test of Morse code to translate
		System.out.println("Please enter Morse code to translate, remember to seperate letters, numbers, and punctuation marks with spaces, and seperate words with slashes (/)");
		System.out.println("Example: -- --- .-. ... . / -.-. --- -.. . = morse code");
		BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));
		String input = readInput.readLine();
		MorseTranslator.Convert(input);
	}

}
