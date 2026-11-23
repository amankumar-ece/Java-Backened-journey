package com.kodewala.inf014;
/*
 * String to UpperCase
 */
public class Driver {

	public static void main(String[] args) {
	
		IConvert convert = (value) -> value.toUpperCase();
		
		String result = convert.convert("java developer");
		
		System.out.println(result);
	}
}
