package edu.albany.cargo;

import edu.albany.ship.Ship;

public class CargoShip extends Ship {

	public int tonnageCapacity;
	
	//Supers the name and year of Ship class and adds tonnage capacity
	public CargoShip(String name, int year, int tons) {
		super(name, year);
		this.tonnageCapacity = tons;
	}

	//Getter for tonnage capacity
	public int getTonnageCapacity() {
		return tonnageCapacity;
	}

	//Setter for tonnage capacity
	public void setTonnageCapacity(int tonnageCapacity) {
		this.tonnageCapacity = tonnageCapacity;
	}

	//To String method includes ship name and tonnage
	public String toString() {
		return ("Ship name: " + this.getShipName() + ", Tonnage Capacity: " + this.tonnageCapacity);
	}
}
