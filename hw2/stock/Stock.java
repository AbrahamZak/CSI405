package edu.albany.hw2.stock;

public class Stock {

	//Enum for stock symbols, each symbol includes a string containing the full name of the company
	public enum symbol {
	    MSFT("Microsoft"), AAPL("Apple"), GOOGL("Google"), AMZN("Amazon"), T("AT&T");
		private String name;

		private symbol (String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
	}

	//Every stock includes doubles for its current price and previous closing price as well as its symbol which includes company name
	private double previousClosingPrice;
	private double currentPrice;
	private symbol symbol;
	
	//Constructor to create the stock with its ticker and name
	public Stock (symbol ticker) {
		this.symbol = ticker;
	}

	//Setters for previous closing price and current price
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	//Getters for previous closing price, current price, and symbol
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public symbol getSymbol() {
		return symbol;
	}
	
	//Function to get the change in percentage from the previous closing price to the current price
	public double getChangePercent() {
			double change = this.currentPrice - this.previousClosingPrice;
			double percentChange = ((change / previousClosingPrice) * 100);
			return percentChange;
	}
}

