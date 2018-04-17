package edu.albany.sandwich;

//Class for the customer that includes the name, money, and the order (a Sandwich object)
public class Customer {

	private String name;
	private double money;
	private Sandwich order;
	
	public Customer(String name, double money, Sandwich order) {
		this.name = name;
		this.money = money;
		this.order = order;
	}

	//Getters and setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Sandwich getOrder() {
		return order;
	}

	public void setOrder(Sandwich order) {
		this.order = order;
	}
	
	//toString that returns the customer's name, money, and sandwich order name
	public String toString() {
		return ("Name: " + this.name + " Money: $" + this.getMoney() + " Order: " + this.getOrder().getSandwichName());
	}
	
}
