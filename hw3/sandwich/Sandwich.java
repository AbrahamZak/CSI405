package edu.albany.sandwich;

//Class for a sandwich objects, includes the name, the price, and quantity of ingredients required
public class Sandwich {

	private String sandwichName;
	private double price;
	private int breadReq;
	private int lettuceReq;
	private int tomatoReq;
	private int cheeseReq;
	private int turkeyReq;
	private int beefReq;
	private int hamReq;
	private int sauceReq;

	public Sandwich(String sandwichName, double price, int breadReq, int lettuceReq, int tomatoReq, int cheeseReq,
			int turkeyReq, int beefReq, int hamReq, int sauceReq) {
		this.sandwichName = sandwichName;
		this.price = price;
		this.breadReq = breadReq;
		this.lettuceReq = lettuceReq;
		this.tomatoReq = tomatoReq;
		this.cheeseReq = cheeseReq;
		this.turkeyReq = turkeyReq;
		this.beefReq = beefReq;
		this.hamReq = hamReq;
		this.sauceReq = sauceReq;
	}

	//Getters and setters for all components
	
	public String getSandwichName() {
		return sandwichName;
	}

	public void setSandwichName(String sandwichName) {
		this.sandwichName = sandwichName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBreadReq() {
		return breadReq;
	}

	public void setBreadReq(int breadReq) {
		this.breadReq = breadReq;
	}

	public int getLettuceReq() {
		return lettuceReq;
	}

	public void setLettuceReq(int lettuceReq) {
		this.lettuceReq = lettuceReq;
	}

	public int getTomatoReq() {
		return tomatoReq;
	}

	public void setTomatoReq(int tomatoReq) {
		this.tomatoReq = tomatoReq;
	}

	public int getCheeseReq() {
		return cheeseReq;
	}

	public void setCheeseReq(int cheeseReq) {
		this.cheeseReq = cheeseReq;
	}

	public int getTurkeyReq() {
		return turkeyReq;
	}

	public void setTurkeyReq(int turkeyReq) {
		this.turkeyReq = turkeyReq;
	}

	public int getBeefReq() {
		return beefReq;
	}

	public void setBeefReq(int beefReq) {
		this.beefReq = beefReq;
	}

	public int getHamReq() {
		return hamReq;
	}

	public void setHamReq(int hamReq) {
		this.hamReq = hamReq;
	}

	public int getSauceReq() {
		return sauceReq;
	}

	public void setSauceReq(int sauceReq) {
		this.sauceReq = sauceReq;
	}
	
	//toString that returns the sandwich name, price, and ingredients needed to make
	public String toString() {
		return ("Sandwhich Name: " + this.getSandwichName() + " Price: $" + this.getPrice() + " \nIngredients Needed: " + "\nBread: " + this.getBreadReq() + "\nLettuce: " + this.getLettuceReq()  + "\nTomato: " + this.getTomatoReq()  + "\nCheese: " + this.getCheeseReq()  + "\nTurkey: " + this.getTurkeyReq()  + "\nBeef: " + this.getBeefReq() + "\nHam: " + this.getHamReq()  + "\nSauce: " + this.getSauceReq()); 
	}
}

	