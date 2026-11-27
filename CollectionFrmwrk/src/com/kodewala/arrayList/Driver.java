package com.kodewala.arrayList;
/*Array List :  (In which scenario we are using ArrayList)
      1. Index Based
      2. Continuous Memory location
      3. Grow dynamically
Good for- Random access / Read ? > index based and continuous memory > O(1)
 * 
 * 
 * Not Good for->
 *               1. Adding and deleting elements in the middle of list Shifting
                 2.  required-> O(n)
 * 
 */
import java.util.ArrayList;

public class Driver {
	
	public static void main(String[] args) {
		
		ArrayList<String> cities = new  ArrayList<String>(); // default capacity: 10 --> Increased by 50%
		
		cities.add("BLR");
		cities.add("CHE");
		cities.add("HYD");
		cities.add("AHM");
		cities.add("DEL");
		
		// access OR random --> get the 3rd element
		System.out.println(cities.get(3));
		
		cities.remove(1);
		
		System.out.println(cities);
		
	}

}
