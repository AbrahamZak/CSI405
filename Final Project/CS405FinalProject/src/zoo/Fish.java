package zoo;

public class Fish extends Animal implements Traits {

	//Fish extends the animal class but also has scales and teeth traits
	private Boolean scales;
	private String scalesStr;
	private Boolean teeth;
	private String teethStr;
	
	public Fish(String name, double weight, String color, String binomialName, Boolean teeth, Boolean scales) {
		super(name, weight, color, binomialName, AnimalType.Fish);
		this.teeth = teeth;
		this.scales = scales;
		setVals();
	}
	
	//ToString specific to fish
	public String toString() {
		return ("The " + this.getName() + " (" + this.getBinomialName() + ") weighs " + this.getWeight() + " kgs. It is a " + this.getColor() + " colored " + this.teethStr + this.scalesStr + "fish."); 
	}
	
	//Getters and setters for Boolean traits
	public Boolean getScales() {
		return scales;
	}

	public void setScales(Boolean scales) {
		this.scales = scales;
	}

	public Boolean getTeeth() {
		return teeth;
	}

	public void setTeeth(Boolean teeth) {
		this.teeth = teeth;
	}

	//setVals method to set the string values for our teeth and scales Booleans, this is the only way to set teethStr and scalesStr
	@Override
	public void setVals() {
		if (teeth==false) {
			teethStr = "toothless ";
		}
		else {
			teethStr = "";
		}
		if (scales==false) {
			scalesStr = "scaleless ";
		}
		else {
			scalesStr = "";
		}
	}

}
