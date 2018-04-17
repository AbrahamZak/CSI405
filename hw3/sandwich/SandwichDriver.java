package edu.albany.sandwich;

public class SandwichDriver {

	public static void main(String[] args) {
		//Create a cashier, sandwich maker, customer, and sandwich object
		Cashier testCashier = new Cashier ("John Smith", 100);
		SandwichMaker testMaker = new SandwichMaker ("Sam Adams", 10, 5, 5, 5, 3, 3, 3, 10);
		Sandwich turkeySandwich = new Sandwich ("Turkey & Cheese Sandwich", 5.35, 2, 1, 1, 2, 2, 0, 0, 1);
		Customer testCustomer = new Customer ("Nick Jones", 20, turkeySandwich);
		
		//Print details of all objects
		System.out.println(testCustomer);
		System.out.println(turkeySandwich);
		System.out.println(testMaker);
		System.out.println(testCashier);
		
		//Process the customer order
		testCashier.processOrder(testCustomer, testMaker);
		
		//Print details of customer, maker, and cashier objects
		System.out.println(testCustomer);
		System.out.println(testMaker);
		System.out.println(testCashier);
		
		//Make a new sandwich object and a customer who wants that sandwich, print details
		Sandwich bigBangSandwich = new Sandwich ("Big Bang Sandwich Sandwich", 15.75, 4, 2, 2, 4, 5, 3, 3, 3);
		Customer testCustomer2 = new Customer ("Sam Jones", 100, bigBangSandwich);
		System.out.println(testCustomer2);
		System.out.println(bigBangSandwich);
		
		//Process the order (but the maker doesn't have enough ingredients)
		testCashier.processOrder(testCustomer2, testMaker);
		//Re-stock the maker with the cashier's money
		testCashier.restock(testMaker);
		//Print details of the maker and cashier
		System.out.println(testMaker);
		System.out.println(testCashier);
		//Process the order
		testCashier.processOrder(testCustomer2, testMaker);
		//Print the details of the maker and cashier
		System.out.println(testMaker);
		System.out.println(testCashier);
	}
}
