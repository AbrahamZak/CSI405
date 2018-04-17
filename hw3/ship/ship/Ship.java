package edu.albany.ship;

public class Ship {

	//The name of the shape and year are the members
	private String shipName;
	private int yearBuilt;
	
	public Ship (String name, int year) {
		this.shipName = name;
		this.yearBuilt = year;
	}

	//Getter for ship name
	public String getShipName() {
		return shipName;
	}

	//Setter for ship name
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	//Getter for year built
	public int getYearBuilt() {
		return yearBuilt;
	}

	//Setter for year built
	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	
	//To String method includes ship name and year built
	public String toString() {
		return ("Ship name: " + this.shipName + ", Year Built: " + this.yearBuilt);
	}
}
