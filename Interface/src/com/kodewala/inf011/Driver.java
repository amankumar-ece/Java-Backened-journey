package com.kodewala.inf011;

public class Driver {
	
	public static void main(String[] args) {
		
		ICheck check = (number) -> number % 2 == 0;
		
		boolean result =check.isEven(66);
		System.out.println(result);
	}

}
