package com.kodewala.collections3;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		
		// Creating a container (Box) so that i can store String Objects
		
		ArrayList<String> cities =  new ArrayList<String>(); // Default: 10
		
		cities.add("Banglore");
		cities.add("Mysore");
		cities.add("Hyd");
		cities.add("Bhubaneshwar");
		cities.add("DL");
		cities.add("Mumbai");
		
	//	cities.add(3 , "Gurgaon"); // Adding element from 3rd index
		
		cities.remove(3);
		System.out.println();
	}

}
