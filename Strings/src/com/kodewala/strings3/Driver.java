package com.kodewala.strings3;

public class Driver {

	public static void main(String[] args) {

		String s = "Kodewala"; // SCP
		
		// In case i want to change s
		
		String s2 = s.concat(" Academy"); // Trying to change the object
		                                 // object created in heap with content kodewala Academy
		
		System.out.println(s2);
	}

}
