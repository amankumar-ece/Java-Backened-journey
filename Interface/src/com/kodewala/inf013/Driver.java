package com.kodewala.inf013;
/*
 * String Length
 */
public class Driver {
	public static void main(String[] args) {
		
		IStringLength length = (value) -> value.length();
		
		int result = length.getLength("AMAN");
		
		System.out.println(result);
	}

}
