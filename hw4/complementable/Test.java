package edu.albany.complementable;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main(String[] args) {
		//Create a binary word test with String "Hello" and print it and its complement
		BinaryWord binWordTest = new BinaryWord("Hello");
		System.out.println(binWordTest.toString());
		BinaryWord binWordTest2 = new BinaryWord("Hello");
		System.out.println(binWordTest2.toString());
		BinaryWord binWordTest3 = new BinaryWord("Goodbye");
		//Should return true
		System.out.println(binWordTest.equals(binWordTest2));
		//Should return false
		System.out.println(binWordTest.equals(binWordTest3));
		
		System.out.println();
		
		//Create a new positive integer object with value of 5
		PositiveInteger testInt = new PositiveInteger(5);
		//Operate with 10, will print 15
		System.out.println(testInt.operate(testInt.getA(), 10));
		//Print the PositiveInteger, which is 5
		System.out.println(testInt.toString());
		//Test if its equal to 5, should be true
		System.out.println(testInt.equals(5));
		//Test if its equal to 15, should be false
		System.out.println(testInt.equals(15));
		
		System.out.println();
		
		//Create a test RGBColor and print
		System.out.print("RGBColor: ");
		RGBColor colorTest = new RGBColor (150, 133, 179);	
		for (Integer i : colorTest.getRGB()) {
			System.out.print(i + " ");
		}
		System.out.println();
		//Compliment it in a new RGBColor
		System.out.print("Complement: ");
		RGBColor colorComp = colorTest.complement();
		//Print the complement
		for (Integer i : colorComp.getRGB()) {
			System.out.print(i + " ");
		}
		System.out.println();
		//Create a list of integers to test the operate command
		System.out.print("Operate: ");
		Integer [] OperateRGB = new Integer[3];
		OperateRGB[0]= 45;
		OperateRGB[1]= 65;
		OperateRGB[2]= 122;
		//Operate our test Integer[] with our main RGBColor object and print result
		for (Integer i: colorTest.operate(colorTest.getRGB(), OperateRGB)) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//Create a list of PositiveInteger objects
		PositiveInteger testInt1 = new PositiveInteger(10);
		PositiveInteger testInt2 = new PositiveInteger(20);
		PositiveInteger testInt3 = new PositiveInteger(30);
		Collection<PositiveInteger> list = new ArrayList <PositiveInteger>();
		list.add(testInt1);
		list.add(testInt2);
		list.add(testInt3);
		//Combine them, should print 60
		System.out.println("Operate for PositiveInteger: " + Semigroup.combine(list, 0));
		
		//Now we do the same but for 3 colors
		RGBColor colorTest1 = new RGBColor (124, 33, 65);	
		RGBColor colorTest2 = new RGBColor (88, 53, 77);	
		RGBColor colorTest3 = new RGBColor (235, 43, 134);
		Collection<RGBColor> list2 = new ArrayList <RGBColor>();
		list2.add(colorTest1);
		list2.add(colorTest2);
		list2.add(colorTest3);
		//Combine them and print
		Semigroup.combine(list2, 1);
		
		
		
		
	}

}
