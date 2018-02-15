package edu.albany.hw2.car;

public class TestDrive {

	public static void main(String[] args) {
		//Create a fuel gauge and odometer object
		Odometer myOdometer = new Odometer();
		FuelGauge myFuelGauge = new FuelGauge();
		//Fill our fuel to max
		fillFuel(myFuelGauge);
		//Drive until all fuel is used
		takeADrive(myOdometer, myFuelGauge);
	}
	
	//Method to fill the entire tank and report its level
	public static void fillFuel(FuelGauge f) {
		for (int i=0; i<=15; i++) {
			f.reportCurrentFuel();
			f.incrementFuel();
		}
	}
	
	//Method to "take a drive" and use all fuel, reports mileage and fuel levels
	public static void takeADrive(Odometer o, FuelGauge f) {
		while (f.getCurrentFuel() != 0) {
			o.reportMileage();
			f.reportCurrentFuel();
			o.Drive(f);
		}
		//Last report of when fuel is empty
		o.reportMileage();
		f.reportCurrentFuel();
	}

}
