package zoo;

public class Amphibian extends Animal implements Traits{

	//Amphibians extends the animal class but also has a poisonous trait
	private Boolean poison;
	private String poisonStr;
	
	public Amphibian(String name, double weight, String color, String binomialName, Boolean poison) {
		super(name, weight, color, binomialName, AnimalType.Amphibian);
		this.poison = poison;
		setVals();
	}
	
	//ToString specific to amphibians
	public String toString() {
		return ("The " + this.getName() + " (" + this.getBinomialName() + ") weighs " + this.getWeight() + " kgs. It is a " + this.getColor() + " colored " + this.poisonStr + "amphibian."); 
	}

	//Getters and setters for Boolean traits
	public Boolean getPoison() {
		return poison;
	}

	public void setPoison(Boolean poison) {
		this.poison = poison;
	}

	//setVals method to set the string values for our poison Boolean, this is the only way to set poisonStr
	@Override
	public void setVals() {
		if (poison==true) {
			poisonStr = "poisonous ";
		}
		else {
			poisonStr = "";
		}
		
	}

}
