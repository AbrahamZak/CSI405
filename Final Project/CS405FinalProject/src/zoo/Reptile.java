package zoo;

public class Reptile extends Animal implements Traits{
	
	//Reptile extends the animal class but also has a poisonous and teeth trait
	private Boolean poison;
	private String poisonStr;
	private Boolean teeth;
	private String teethStr;
	
	public Reptile(String name, double weight, String color, String binomialName, Boolean teeth, Boolean poison) {
		super(name, weight, color, binomialName, AnimalType.Reptile);
		this.poison = poison;
		this.teeth = teeth;
		setVals();
	}

	//ToString specific to reptiles
	public String toString() {
		return ("The " + this.getName() + " (" + this.getBinomialName() + ") weighs " + this.getWeight() + " kgs. It is a " + this.getColor() + " colored " + this.teethStr + this.poisonStr + "reptile."); 
	}
	
	//Getters and setters for Boolean traits
	public Boolean getPoison() {
		return poison;
	}

	public void setPoison(Boolean poison) {
		this.poison = poison;
	}

	public Boolean getTeeth() {
		return teeth;
	}

	public void setTeeth(Boolean teeth) {
		this.teeth = teeth;
	}

	//setVals method to set the string values for our poison and teeth Booleans, this is the only way to set poisonStr and teethStr
	@Override
	public void setVals() {
		if (poison==true) {
			poisonStr = "poisonous ";
		}
		else {
			poisonStr = "";
		}
		if (teeth==false) {
			teethStr = "toothless ";
		}
		else {
			teethStr = "";
		}
		
	}

}
