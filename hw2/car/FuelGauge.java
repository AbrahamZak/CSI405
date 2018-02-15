package edu.albany.hw2.car;

public class FuelGauge {
	//Variable for our current fuel and a max fuel static value
    private static int MAXFUEL = 15;
	private int currentFuel;

	//Start the fuel gauge at empty
	public FuelGauge() {
		currentFuel = 0;
	}
	
	//Getter for current fuel
	public int getCurrentFuel() {
		return currentFuel;
	}
	
	//Report the current fuel
	public void reportCurrentFuel() {
		System.out.println("The current fuel level is " + currentFuel + " gallons.");
	}
	
	//Increment the fuel amount
	public void incrementFuel() {
		if (currentFuel<MAXFUEL) {
		currentFuel++;
		}
		//If fuel is max, do nothing and let the user know
		else {
			System.out.println("The fuel tank is currently full");
		}
	}
	
	//Decrement the fuel amount
	public void decrementFuel() {
		if (currentFuel>0) {
		currentFuel--;
		}
		//If fuel is at 0, do nothing and let the user know
		else {
			System.out.println("The fuel tank is empty");
		}
	}
}
