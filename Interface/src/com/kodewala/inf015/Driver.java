package com.kodewala.inf015;

public class Driver {
	
	public static void main(String[] args) {
		
		INumberCheck check= (number) -> number > 0;
		
		boolean result = check.check(-20);
		
		System.out.println(result);
	}

}
