package com.ualbany.hw1.problem1;

public class Employee {
	
private String firstName;
private String lastName;
private double monthlySalary;

//Employee includes a first name, last name, and monthly salary
public Employee(String first, String last, double salary){
	this.firstName = first;
	this.lastName = last;
	//If specified salary is less than 0, set it to 0
	if (salary<0) {
		this.monthlySalary = 0.0;
	}
	else {
	this.monthlySalary = salary;
	}
}

//Getters and setters for first name, last name, and monthly salary
public String getFirstName() {
	return this.firstName;
}
public void setFirstName(String first) {
	this.firstName = first;
}
public String getLastName() {
	return this.lastName;
}
public void setLastName(String last) {
	this.lastName = last;
}
public double getMonthlySalary() {
	return this.monthlySalary;
}
public void setMonthlySalary(Double sal) {
	this.monthlySalary = sal;
}
}
