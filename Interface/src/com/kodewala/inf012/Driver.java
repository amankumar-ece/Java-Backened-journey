package com.kodewala.inf012;
/*
 * Square 
 */
public class Driver {
	
	public static void main(String[] args) {
		
		ISquare square = (a) -> a * a;
		
		int result = square.calculate(5);
		
		System.out.println("Square: "+ result);
	}

}
