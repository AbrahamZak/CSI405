package com.ualbany.hw1.problem3;

public class Address {

	private String lineOne, lineTwo, City, State, Zip;
	
	//Constructor for an address
	public Address(String lineOne, String lineTwo, String City, String State, String Zip){
		this.lineOne = lineOne;
		this.lineTwo = lineTwo;
		this.City = City;
		this.State = State;
		this.Zip = Zip;
	}
	
	//Returns a string with the full address
	public String getAddress(){
		//If there is no line 2 for the address, skip it
		if (lineTwo == "") {
			return (this.lineOne + ", " + this.City + ", " + this.State + " " + this.Zip);
		}
		else return (this.lineOne + ", " + this.lineTwo + ", " + this.City + ", " + this.State + " " + this.Zip);
	}

	//Getters and setters for all aspects of an address object
	
	public String getLineOne() {
		return lineOne;
	}

	public void setLineOne(String lineOne) {
		this.lineOne = lineOne;
	}

	public String getLineTwo() {
		return lineTwo;
	}

	public void setLineTwo(String lineTwo) {
		this.lineTwo = lineTwo;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		Zip = zip;
	}
}
