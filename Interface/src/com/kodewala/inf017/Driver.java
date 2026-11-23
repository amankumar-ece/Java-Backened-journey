package com.kodewala.inf017;

public class Driver {
	public static void main(String[] args) {
		
		ISalary obj = (a,b) -> {
			
			double finalSalary = a - b;
			
			return finalSalary;
		};
		
		double result = obj.calculate(50000, 5000);
		
		System.out.println("Final salary: "+ result);
		
	}

}
