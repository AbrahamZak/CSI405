package edu.albany.ship;

import edu.albany.cargo.CargoShip;
import edu.albany.cruise.CruiseShip;

public class TestProgram {

	public static void main(String[] args) {
		//Create various ships
		Ship testShip = new Ship ("Ship test", 1925);
		CargoShip testCargo = new CargoShip ("Cargo test", 1953 ,20000);
		CruiseShip testCruise = new CruiseShip ("Cruise test", 1977, 200);
		Ship testShip2 = new Ship ("Golden Eagle", 1906);
		CargoShip testCargo2 = new CargoShip ("Cargo Max", 1974 ,30000);
		CruiseShip testCruise2 = new CruiseShip ("Cruiser", 1967, 255);
		//Put them into a ship array
		Ship[] shipArray = {testShip, testCargo, testCruise, testShip2, testCargo2, testCruise2};
		//Iterate through elements and print
		for (Ship a : shipArray) {
			System.out.println(a);
		}
	}

}
