package com.kodewala.oops.abstraction3;

public class Driver {
	public static void main(String[] args) {
	
		Employee e1 = new FullTime();
		Employee e2 = new PartTime();
		
		e1.calculateSalary(0);
		e2.calculateSalary(5);
	}
}
