package zoo;

//Abstract class template for all animal types
public abstract class Animal {
	
	//Contains the name of the animal, its weight, color, and binomial name, and AnimalType enum
	private String name;
	private double weight;
	private String color;
	private String binomialName;
	private AnimalType type;
	
	public Animal (String name, double weight, String color, String binomialName, AnimalType type) {
		this.name = name;
		this.weight = weight;
		this.color = color;
		this.binomialName = binomialName;
		this.setType(type);
	}

	//All getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getBinomialName() {
		return binomialName;
	}


	public void setBinomialName(String binomialName) {
		this.binomialName = binomialName;
	}

	public AnimalType getType() {
		return type;
	}

	public void setType(AnimalType type) {
		this.type = type;
	}
}
