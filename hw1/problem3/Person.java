package com.ualbany.hw1.problem3;

public class Person {
	private String firstName;
	private String lastName;
	private Address personAddress;

//Constructor for a person, includes a first name, last name, and an address object
public Person (String first, String last, Address address) {
	this.firstName = first;
	this.lastName = last;
	this.personAddress = address;
}

//Getters and setters

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
public Address getPersonAddress() {
	return personAddress;
}
public void setPersonAddress(Address personAddress) {
	this.personAddress = personAddress;
}

//Method to return the full name of a person
public String getFullName() {
	return (this.firstName + " " + this.lastName);
}
}