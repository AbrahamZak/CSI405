package edu.albany.hw2.car;

public class Odometer {
	
//Variable for the mileage
private int mileage;

//Start the odometer at 0
public Odometer() {
	mileage = 0;
}

//Getter for mileage
public int getCurrentMileage() {
	return mileage;
}

//Method to report the mileage
public void reportMileage() {
	System.out.println("The current mileage is " + mileage + " miles.");
}

//Increments the mileage, resets at 999,999 miles
public void incrementMileage() {
	if (mileage<999999) {
		mileage++;
	}
	else {
		mileage = 0;
	}
}

//Method to drive using a FuelGuage f
public void Drive (FuelGauge f) {
	
	//If we have no more fuel, do nothing
	if (f.getCurrentFuel()==0) {
		return;
	}
	
	//First, increment the mileage
	incrementMileage();
	
	//If the mileage is less than 22, we continue
	if (mileage < 22) {
		return;
	}
	
	//If the mileage is divisible by 22, we can lower the fuel by 1 gallon
	if (mileage%22 == 0) {
		f.decrementFuel();
		return;
	}
	else {
		return;
	}
}
}
