package com.kodewala.loops3;

public class Driver2 {

	public static void main(String[] args) {

		String[] cities = {"Lucknow","Banglore","Andhra Pradesh","Karnataka","Banglore","Mumbai",
				          "Chennai","Hyderabad","Banglore","Pune","Goa"};
		
		// Find if Banglore is part of the list or not 
		
		for(int index = 0; index < cities.length; index++)
		{
			String currentCity = cities[index];
			if(currentCity.equals("Banglore"))
			{
				System.out.println("Banglore is the part of city List");
				break; // break the loop --> you will come out of the loop
			}
		}		
	}
}
