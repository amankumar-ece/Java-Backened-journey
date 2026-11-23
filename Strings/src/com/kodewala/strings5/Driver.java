package com.kodewala.strings5;

public class Driver {

	public static void main(String[] args) {
		String s1 = "This" + " is from" + " Kodewala Academy";

		// String s1 = "This is from kodewala Academy Banglore";
		System.out.println(s1);

		String s2 = "Kodewala"; // SCP
		String s3 = "Academy"; // SCP

		String s4 = s2 + s3; // Heap
 
		System.out.println(s4);
		
		String s5 ="KodewalaAcademy"; // SCP
		
		System.out.println(s5 == s4.intern());
	}

}
