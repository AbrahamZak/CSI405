package edu.albany.hw2.stock;

import edu.albany.hw2.stock.Stock.symbol;

public class TestProgram {

	public static void main(String[] args) {
		//Create a stock for Microsoft
		Stock Microsoft = new Stock (symbol.MSFT);
		//Set its previous closing price to 58.9 and its current price to 59
		Microsoft.setPreviousClosingPrice(58.9);
		Microsoft.setCurrentPrice(59);
		//Print the percent change
		System.out.println(Microsoft.getChangePercent() + "%");
		
		//Create a stock for Google
		Stock Google = new Stock (symbol.GOOGL);
		//Set its previous closing price to 755 and its current price to 702
		Google.setPreviousClosingPrice(755);
		Google.setCurrentPrice(702);
		//Print the percent change
		System.out.println(Google.getChangePercent() + "%");
	}
}
