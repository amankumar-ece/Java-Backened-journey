package com.kodewala.strings2;

public class Driver {

	public static void main(String[] args) {

		String s1 =  "Aman"; // SCP --> 123abc
		
		String s2 = new String("Aman kumar"); // 1 object in SCP + 1 in Heap --> 456xyz
		
	//	System.out.println(s1 == s2); // 123abc == 456xyz --> false
		
		String s3 = new String("Aman");
		String s4 = new String("Aman");
		
		System.out.println(s4 == s3); // --> false  
		
		System.out.println(s4.equals(s3)); // --> True 
	}

}
