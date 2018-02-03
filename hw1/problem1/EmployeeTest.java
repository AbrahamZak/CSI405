package com.ualbany.hw1.problem1;

public class EmployeeTest {

	public static void main(String[] args) {
		//Create two employees Tom and Harry
		Employee Tom = new Employee ("Tom", "Riddle", 10000);
		Employee Harry = new Employee ("Harry", "Potter", 7500);
		//Print their yearly salaries
		System.out.println("The yearly salary of " + Tom.getFirstName() + " " + Tom.getLastName() + " is " + Tom.getMonthlySalary()*12);
		System.out.println("The yearly salary of " + Harry.getFirstName() + " " + Harry.getLastName() + " is " + Harry.getMonthlySalary()*12);
		//Give both 10% raises
		Tom.setMonthlySalary(Tom.getMonthlySalary()*1.1);
		Harry.setMonthlySalary(Harry.getMonthlySalary()*1.1);
		//Print new yearly salaries
		System.out.println("The yearly salary of " + Tom.getFirstName() + " " + Tom.getLastName() + " is " + Tom.getMonthlySalary()*12);
		System.out.println("The yearly salary of " + Harry.getFirstName() + " " + Harry.getLastName() + " is " + Harry.getMonthlySalary()*12);
	}
}
