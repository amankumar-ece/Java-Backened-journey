package com.objects5;

public class Driver {

	public static void main(String[] args)
	{
		String s1 = "kodewala"; // 1 object Created in SCP
		
		String s3 = s1.concat("Academy"); // s3 --> Heap and Content : kodewala Academy
        String s4 = "Kodewala Academy"; // s4 --> SCP and Content : Kodewala Academy
        
        System.out.println(s3 == s4);
        
        
        String s10 = "Banglore";
        String s11 = " India";
        String s12 = s10 + s11; // s12 will  be Created in Heap --> Banglore India 
        
		String s13 = "Banglore India"; // SCP
		
		// System.out.println(s12 == s13); --> False object reference or address different 
		
		System.out.println(s12.equals(s13)); // it gives true as content same 
		
		String s14 = "Hello" +"World"+"India"; // Compile Time optimization 
		                                       //   only Single object will be created 
		
		
		
	}

}
