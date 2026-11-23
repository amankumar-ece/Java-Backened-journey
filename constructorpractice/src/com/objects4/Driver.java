package com.objects4;

public class Driver {

	public static void main(String[] args) 
	{
		String s1 = "Aman"; // 1 obj created in SCP
		
		String s3 = "Aman"; // s3 will refer existing s1 object.
		
		System.out.println(s1 == s3); // true
		
		String s2 = new String("aman"); // 1 in Heap + 1SCP
		
		System.out.println(s2.equals(s3)); // False

	}

} 