package com.kodewala.Array;

public class Driver1 {

	public static void main(String[] args) {
       // Create an Array which will store city name -->
		
		String cities[]= new String [5];
		
		// Storing the cities
		cities[0]= "Banglore";
		cities[1]= "Chennai";
		cities[2]= "Hyderabad";
		cities[3]= "Sitamarhi";
	    cities[4]= "Surat";
	    
	    for(int index=0; index < cities.length; index++)
	    {
	    	if(cities[index].startsWith("S"))
	    	{
	    		System.out.println("City Starting with 'S' : " +cities[index]);
	    	}
	    }
	}
}
