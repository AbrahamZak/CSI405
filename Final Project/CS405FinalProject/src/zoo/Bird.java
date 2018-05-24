package zoo;

public class Bird extends Animal implements Traits {

	private Boolean fly;
	private String flyStr;
	
	//Bird extends the animal class but also has a flight ability trait
	public Bird (String name, double weight, String color, String binomialName, Boolean fly) {
		super(name, weight, color, binomialName, AnimalType.Bird);
		this.fly = fly;
		setVals();
	}

	//setVals method to set the string values for our canFly Boolean, this is the only way to set fly
	@Override
	public void setVals() {
		if (fly==false) {
			flyStr = "flightless ";
		}
		else {
			flyStr = "";
		}
	}
	
	//ToString specific to birds
	public String toString() {
		return ("The " + this.getName() + " (" + this.getBinomialName() + ") weighs " + this.getWeight() + " kgs. It is a " + this.getColor() + " colored " + this.flyStr + "bird.");
	}

	//Getters and setters for Boolean traits
	public Boolean getFly() {
		return fly;
	}

	public void setFly(Boolean fly) {
		this.fly = fly;
	}


}
