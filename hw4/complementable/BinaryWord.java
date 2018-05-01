package edu.albany.complementable;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.BitSet;

public class BinaryWord implements Complementable<BitSet>{
	//All components to make a bitset from a string with its complement
	//Bitsets for original and complement
	private BitSet original;
	private BitSet complement;
	//Placeholder for tostring
	private String toStr = "";
	//Arraylist for bitarray
	private ArrayList<String> bitArray = new ArrayList<>();
	private int numOfBits = 0;
	private final int std = 7;
	//String builder for both
	private StringBuilder stringBuilder1 = new StringBuilder();
	private StringBuilder stringBuilder2 = new StringBuilder();
	private byte[] byt;
	private int space = 0;
	
	//Constructor that creates the bitset and complement and sets the tostring
	public BinaryWord(String s) {
		//Try to get the bytes
		try {
			byt = s.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		//For each byte in array process to bitarray
		for (byte x : byt) {
			int temp = Integer.parseInt(Byte.toString(x));
			String binary = Integer.toBinaryString(temp);
			
			if (binary.length() < 7) {
				space += (std - binary.length());
			}
			
			bitArray.add(binary);
		}
		numOfBits = (bitArray.size() * 7) - space;
		original = new BitSet(numOfBits);
		complement = new BitSet(numOfBits);
		int count = 0;
		//Get the complement
		for (String str : bitArray) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '0') {
					complement.set(count);
					count++;
				}
				else if (str.charAt(i) == '1') {
					original.set(count);
					count++;
				}
				else {
					System.out.println("Error");
				}
			}
		}
		//Build the strings with stringbuilder
         for( int i = 0; i < original.length();  i++ )
         {
             stringBuilder1.append(original.get(i) == true ? 1: 0);
         }
         for (int i = 0; i < complement.length(); i++) {
        	 	stringBuilder2.append(complement.get(i) == true ? 1: 0);
         }
         if (stringBuilder1.length() > stringBuilder2.length()) {
             for (int i = stringBuilder2.length(); i < stringBuilder1.length(); i++) {
         	 	stringBuilder2.append('0');
             }
         }
         else {
        	 	for (int i = 0; i < stringBuilder2.length(); i++) {
        	 		stringBuilder1.append('0');
        	 	}
         }
         //Set the tostring
         toStr = "Original in binary: \n" + stringBuilder1 + "\nComplement in binary: \n" + stringBuilder2;
	}
	
	//Returns the complement
	@Override
	public BitSet complement() {
		return complement;
	}
	
	//Checks if a bitset is equal
	public boolean equals(BinaryWord a) {
		if (this.toString().equals(a.toString())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Returns the toString
	public String toString() {
		return toStr;
	}


}