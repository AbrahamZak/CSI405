package edu.albany.hw2.textToMorse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMorse {

	public static void main(String[] args) throws IOException {		
		//Ask the user to provide their words to translate to morse
		System.out.println("Please enter a sentence to translate to morse code:");
		BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));
		String input = readInput.readLine();
		MorseTranslator.Convert(input);
	}

}
