package zoo;

public class Mammal extends Animal implements Traits {

	//Mammal extends the animal class but also has eating type and furry traits
	private String eatingType;
	private Boolean furry;
	private String furryStr;
	
	public Mammal(String name, double weight, String color, String binomialName, String eatingType, Boolean furry) {
		super(name, weight, color, binomialName, AnimalType.Mammal);
		this.setEatingType(eatingType);
		this.furry = furry;
		setVals();
	}

	//Getters and setters for eating type
	public String getEatingType() {
		return eatingType;
	}

	public void setEatingType(String eatingType) {
		this.eatingType = eatingType;
	}
	
	//ToString specific to mammals
	public String toString() {
		return ("The " + this.getName() + " (" + this.getBinomialName() + ") weighs " + this.getWeight() + " kgs. It is a " + this.getColor() + " colored " + this.eatingType + " " + this.furryStr + "mammal."); 
	}

	//setVals method to set the string values for our furry Boolean, this is the only way to set furryStr
	@Override
	public void setVals() {
		if (furry==true) {
			furryStr = "furry ";
		}
		else {
			furryStr = "";
		}
		
	}

	//Getters and setters for Boolean traits
	public Boolean getFurry() {
		return furry;
	}

	public void setFurry(Boolean furry) {
		this.furry = furry;
	}

}
