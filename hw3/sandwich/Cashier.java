package edu.albany.sandwich;

//Class for the cashier, contains the name and the amount of money
public class Cashier {

	private String name;
	private double money;

	public Cashier(String name, double money) {
		this.name = name;
		this.money = money;
	}
	
	//Getters and Setters
	
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


	/* Method to process a customer's order
	 * If the maker can make the order, it is made
	 * Then if the customer has the money the exchange is made
	 * The customer loses the price of the sandwich and the cashier gains it
	 */
	public void processOrder(Customer order, SandwichMaker maker) {
		System.out.println("Hello, welcome to John's Burgers.");
		System.out.println("Welcome, " + order.getName() + ". I see you would like a " + order.getOrder().getSandwichName() + ". This sandwich costs $" + order.getOrder().getPrice() + ".");
		System.out.println(maker.getName() + "! Order of " + order.getOrder().getSandwichName() + "!");
		if (maker.Make(order.getOrder()) == true){
			System.out.println("Order for " + order.getName() + "! Your " + order.getOrder().getSandwichName() + " is ready!");
			System.out.println("That will be $" + order.getOrder().getPrice() + ".");	
			if (order.getMoney() < order.getOrder().getPrice()) {
				System.out.println("It seems you are $" + (order.getOrder().getPrice() - order.getMoney()) + " short.");
				return;
			}
			else {
				order.setMoney(order.getMoney() - order.getOrder().getPrice());
				this.setMoney(this.getMoney() + order.getOrder().getPrice());
				System.out.println("Thank you for your business. Here's your $" + order.getMoney() + " in change.");
			}
		}
		else if (maker.Make(order.getOrder()) == false){
		System.out.println("It seems we don't have enough ingredients to make your order right now.");
		}
	}
	
	//Method to restock the sandwich maker, if the cashier has $20, the designated maker will receive +10 of every ingredient 
	public void restock (SandwichMaker maker) {
		if (this.getMoney() > 20) {
			System.out.println("Restocking " + maker.getName() + ".");
			this.setMoney(this.getMoney() - 20);
			maker.setCurBread(maker.getCurBread()+10);
			maker.setCurLettuce(maker.getCurLettuce()+10);
			maker.setCurTomato(maker.getCurTomato()+10);
			maker.setCurCheese(maker.getCurCheese()+10);
			maker.setCurTurkey(maker.getCurTurkey()+10);
			maker.setCurHam(maker.getCurHam()+10);
			maker.setCurBeef(maker.getCurBeef()+10);
			maker.setCurSauce(maker.getCurSauce()+10);
		}
		else {
			System.out.println("Not enough money to restock");
		}
	}
	
	//toString method that returns the cashier's name and money amount
	public String toString() {
		return ("Name: " + this.name + " Money: $" + this.getMoney());
	}
	
	}
	
	

