package edu.albany.complementable;


public class PositiveInteger extends Semigroup<Integer> {
	//integer to hold first number and result of operate method
	private Integer a;
	public PositiveInteger(Integer a) {
		this.a = a;
	}
	//Method to add the two numbers and store in result
	@Override
	public Integer operate(Integer a, Integer b) {
		return a + b;
	}

	//Returns the result as a string
	public String toString(){
		return Integer.toString(a);
	}
	
	//Check if the result is equal to our integer a plus a new number
	public Boolean equals(Integer c) {
		if (c == a) {
			return true;
		}
		else {
			return false;
		}
	}
	//Getter and setter for Integer a
	public Integer getA() {
		return a;
	}
	public void setA(Integer a) {
		this.a = a;
	}
	
}