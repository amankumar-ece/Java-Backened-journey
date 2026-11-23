package com.objects6;

public class Driver {

	public static void main(String[] args)
	{
		String s1 = "Hello" + "World"; // SCP
		
		String s2 = "Kodewala";
		String s3 = "Academy";
		
		String s4 = s2 + s3; // s4? --> Heap --> "Kodewala Academy" 
       
		String s5 = s4.intern(); // copy object(s4) from Heap to SCP
		
		System.out.println(s4 == s5); // true (SCP) 
		

	}

}
