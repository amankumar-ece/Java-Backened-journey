package com.kodewala.stringsPractice;

public class StringExample {
	
	public static void main (String args[])
	{
		// using New keyword to create String objects on the Heap
		
		String s1 = new String ("Kodewala"); // Creates one object in the heap
		String s2 = new String ("Kodewala"); // Creates another object in the heap 
		
		// Comparing objects using == (check memory references)
		
		System.out.println("s1 == s2: "+ (s1 == s2)); // false because each new String creates a distinct object
		                                              // on the Heap 
		
		System.out.println("s1.equals(s2): " + s1.equals(s2)); // True Because , Equals compares Content , Not References
		
		
	}

}
