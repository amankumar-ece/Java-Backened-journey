package com.kodewala.inf016;

public class Driver {

	public static void main(String[] args) {
		
		ISalary salary = (a,b) -> a + b;
		
		double result = salary.calculateSalary(50000,20000);
		
		System.out.println("Total Salary: "+ result);
	}
}
