package com.ualbany.hw1.problem3;

public class Bank {
	
	private String bankName;
	private Address bankAddress;
	
	//Constructor for bank, includes address object and bank name
	public Bank(String name, Address address){
		this.bankName = name;
		this.bankAddress = address;
	}
	
	//Getters and setters for bank components
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Address getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(Address bankAddress) {
		this.bankAddress = bankAddress;
	}
	
	public static void main(String[] args) {
		//Create two address objects, one for a client and one for a bank
		Address personAddress = new Address ("1730 East 14th ST", "5th FL", "Brooklyn", "NY", "11229");
		Address bankAddress = new Address ("1722 Avenue U", "", "Brooklyn", "NY", "11229");
		//Create a bank "Chase Bank" and a person/client "Shawn Carter"
		Bank Chase = new Bank ("Chase Bank", bankAddress);
		Person JayZ = new Person ("Shawn", "Carter", personAddress);
		System.out.println("Person: " + JayZ.getFullName() + " has arrived to bank: " + Chase.getBankName() + " to open an account.");
		
		//Create an account for the person with initial deposit of $1000
		CheckingBankAccount JayZAccount = new CheckingBankAccount (1000);
		
		//Deposit and withdraw tests
		deposit(JayZ, JayZAccount, 1000);
		withdraw(JayZ, JayZAccount, 500);
	}
	
	//Method to deposit a certain amount into a client's checking account and print receipt
	public static void deposit (Person client, CheckingBankAccount account, int amount) {
		account.deposit(amount);
		System.out.println("Receipt:");
		System.out.println("Name: " + client.getFullName());
		System.out.println("Address: " + client.getPersonAddress().getAddress());
		System.out.println("Current Balance: " + account.getValue());
	}
	
	//Method to withdraw a certain amount into a client's checking account and print receipt
	public static void withdraw (Person client, CheckingBankAccount account, int amount) {
		account.withdraw(amount);
		System.out.println("Receipt:");
		System.out.println("Name: " + client.getFullName());
		System.out.println("Address: " + client.getPersonAddress().getAddress());
		System.out.println("Current Balance: " + account.getValue());
	}

}
