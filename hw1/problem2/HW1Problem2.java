package com.ualbany.hw1.problem2;
import java.util.Random;

public class HW1Problem2 {

	//Method to test if secondNum is a multiple of firstNum
	public static Boolean multiple(int firstNum, int secondNum) {
		//If the modulus is 0, return true, if not return false
		if (firstNum%secondNum == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Method to get the remainder of any number divided by 7
	public static double remainder (int num) {
		return (num % 7);
	}
	
	//Method to get the distance between two points (x1,y1) (x2,y2)
	public static double distance (double x1, double y1, double x2, double y2) {
		return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
	}
	
	//Method to get 10 random coin flips and print results
	public static void flip() {
		Random coinFlip = new Random();
		for (int i=0; i<10; i++) {
		int flip = coinFlip.nextInt(100);
		if (flip<=50) {
			System.out.println("Tails");
		}
		else {
			System.out.println("Heads");
		}
		}
	}
}
