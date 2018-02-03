package com.ualbany.hw1.problem2;
import java.util.Scanner;
public class Problem2Driver {

	public static void main(String[] args) {
		//Scanner to take user input
		Scanner in = new Scanner(System.in);
		
		//Prompt user for two numbers to test if the second is a multiple of the first
		System.out.println("Enter a number: ");
		int num = in.nextInt();
		System.out.println("Enter a number that you think is its multiple: ");
		int multiple = in.nextInt();
		
		if (HW1Problem2.multiple(num, multiple)==true) {
			System.out.println(multiple + " is a multiple of " + num +".");
		}
		else {
			System.out.println(multiple + " is not a multiple of " + num +".");
		}
		
		//Prompt user for a number and print remainder when divided by 7
		System.out.println("Enter a number for the remainder when divided by 7: ");
		int remainderCheck = in.nextInt();
		System.out.println("The remainder of " + remainderCheck + " and 7 is: " + HW1Problem2.remainder(remainderCheck) + ".");
		
		//Prompt user for two coordinates, print the distance
		System.out.println("Enter a coordinate x1: ");
		int x1 = in.nextInt();
		System.out.println("Enter a coordinate y1: ");
		int y1 = in.nextInt();
		System.out.println("Enter a coordinate x2: ");
		int x2 = in.nextInt();
		System.out.println("Enter a coordinate y2: ");
		int y2 = in.nextInt();
		System.out.println("The distance between these two coordinates is: " + HW1Problem2.distance(x1, y1, x2, y2));
		
		//Close our scanner
		in.close();
		
		//Print 10 random coin flips
		System.out.println("Ten random coin flips: ");
		HW1Problem2.flip();
	}
}
