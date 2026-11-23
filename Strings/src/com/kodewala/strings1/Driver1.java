package com.kodewala.strings1;


class User
{
	String firstName;
	
public User(String firstName) {
		super();
		this.firstName = firstName;
	}


}
public class Driver1 {

	public static void main(String[] args) {
     
		String city1 = "Banglore";
		String city2 ="Banglore";
		String city3 ="Banglore";
		String city4 ="Banglore";
		String city5 ="Banglore";
		
		// System.out.println(city1 == city2);		
		
		System.out.println(city1.equals(city2));
		
		// *equals method will compare to reference objects (contents of object)
		
		User user1 = new User("Kodewala");
		User user2 = new User("Kodewala");
		
		System.out.println(user1.equals(user2));
	
	}
}
