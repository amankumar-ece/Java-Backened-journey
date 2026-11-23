package com.objects3;

public class StringPractice {
/*
	public static void main(java.lang.String[] args) {

		// Creating String obj
		
		// Using literals
		String s1 = "Banglore"; // SCP(String constant pool)
		
		// Using new keyword
		String s = new String("Hello"); // 2 object created(1 in heap + 1 in SCP) 
		
		System.out.println(s1 == s2);
	}

}
*/
	public static void main(String[] args) {

	{
		String s1 = "Bangalore"; // 1 obj in SCP
		
		String s2 = new String("Bangalore"); // Heap + SCP  no object created. 
		                                    //  s2 will refer same object(s1)
		
		 // System.out.println(s1 == s2); // compare the objects address
		
		//System.out.println(s1.equals(s2)); // Equals methods will compare the content of object
	   }		
   }
}