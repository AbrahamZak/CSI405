package edu.albany.cruise;

import edu.albany.ship.Ship;

public class CruiseShip extends Ship {

	private int maxPassengers;
	
	//Supers the name and year of Ship class and adds max passengers
	public CruiseShip(String name, int year, int max) {
		super(name, year);
		this.maxPassengers = max;	
	}

	//Getter for max passengers
	public int getMaxPassengers() {
		return maxPassengers;
	}

	//Setter for max passengers
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	//To String method includes ship name and max passengers
	public String toString() {
		return ("Ship name: " + this.getShipName() + ", Max Passengers: " + this.maxPassengers);
	}

}
