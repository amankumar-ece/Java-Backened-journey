package com.kodewala.inf010;

public class Driver {

	public static void main(String[] args) {

		IMax max = (a,b) -> a > b ? a : b;
		
		int result = max.findMax(45, 450);
		System.out.println(result);
	}

}
