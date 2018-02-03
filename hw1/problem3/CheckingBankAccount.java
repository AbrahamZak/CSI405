package com.ualbany.hw1.problem3;

public class CheckingBankAccount {
	
	private double value;

	//Constructor for checking bank account with an initial deposit
	public CheckingBankAccount(double initialDeposit) {
		this.value = initialDeposit;
	}
	
	//Getter and setter for account value
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	//Method to deposit a certain amount
	public void deposit (double amount) {
		this.value = this.value + amount;
	}
	
	//Method to withdraw a certain amount
	public void withdraw (double amount) {
		this.value = this.value - amount;
	}
}

