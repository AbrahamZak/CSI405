package edu.albany.sandwich;

//Class for a Sandwich maker, includes the name and the quantity of ingredients on hand 
public class SandwichMaker {

	private String name;
	private int curBread;
	private int curLettuce;
	private int curTomato;
	private int curCheese;
	private int curTurkey;
	private int curBeef;
	private int curHam;
	private int curSauce;
	
	public SandwichMaker(String name, int curBread, int curLettuce, int curTomato, int curCheese, int curTurkey,
			int curBeef, int curHam, int curSauce) {
		this.name = name;
		this.curBread = curBread;
		this.curLettuce = curLettuce;
		this.curTomato = curTomato;
		this.curCheese = curCheese;
		this.curTurkey = curTurkey;
		this.curBeef = curBeef;
		this.curHam = curHam;
		this.curSauce = curSauce;
	}

	//Getters and setters
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCurBread() {
		return curBread;
	}


	public void setCurBread(int curBread) {
		this.curBread = curBread;
	}


	public int getCurLettuce() {
		return curLettuce;
	}


	public void setCurLettuce(int curLettuce) {
		this.curLettuce = curLettuce;
	}


	public int getCurTomato() {
		return curTomato;
	}


	public void setCurTomato(int curTomato) {
		this.curTomato = curTomato;
	}


	public int getCurCheese() {
		return curCheese;
	}


	public void setCurCheese(int curCheese) {
		this.curCheese = curCheese;
	}


	public int getCurTurkey() {
		return curTurkey;
	}


	public void setCurTurkey(int curTurkey) {
		this.curTurkey = curTurkey;
	}


	public int getCurBeef() {
		return curBeef;
	}


	public void setCurBeef(int curBeef) {
		this.curBeef = curBeef;
	}


	public int getCurHam() {
		return curHam;
	}


	public void setCurHam(int curHam) {
		this.curHam = curHam;
	}


	public int getCurSauce() {
		return curSauce;
	}


	public void setCurSauce(int curSauce) {
		this.curSauce = curSauce;
	}

	/*Method to make a sandwich
	 * Returns true if the maker has the necessary ingredients and removes those ingredients
	 * Returns false if the maker does not have the necessary ingredients
	 */
	public Boolean Make(Sandwich Order) {
		if (curBread>Order.getBreadReq() && curLettuce>Order.getLettuceReq() 
				&& curTomato>Order.getTomatoReq() && curCheese>Order.getCheeseReq()
				&& curTurkey>Order.getTurkeyReq() && curBeef>Order.getBeefReq()
				&& curSauce> Order.getSauceReq()) {
			curBread = curBread - Order.getBreadReq();
			curLettuce = curLettuce - Order.getLettuceReq();
			curTomato = curTomato - Order.getTomatoReq();
			curCheese = curCheese - Order.getCheeseReq();
			curTurkey = curTurkey - Order.getTurkeyReq();
			curBeef = curBeef - Order.getBeefReq();
			curSauce = curSauce - Order.getSauceReq();
		return true;
		}
		return false;
	}
	
	//toString that returns the name and current stock of the maker
	public String toString() {
		return ("Name: " + this.name + " \nCurrent Stock: " + "\nBread: " + this.getCurBread() + "\nLettuce: " + this.getCurLettuce()  + "\nTomato: " + this.getCurTomato()  + "\nCheese: " + this.getCurCheese()  + "\nTurkey: " + this.getCurTurkey()  + "\nBeef: " + this.getCurBeef() + "\nHam: " + this.getCurHam()  + "\nSauce: " + this.getCurSauce()); 
	}
	
}
