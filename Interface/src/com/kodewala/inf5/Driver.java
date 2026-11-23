package com.kodewala.inf5;

public class Driver {

	public static void main(String[] args) {
		
		User user = new User("Kw123", "Kodewala Academy");
		
       DataCleaner cleaner = new DataCleaner();
		
		//Cleaning the user object...
		cleaner.clean(user);

	}

}
