package com.kodewala.Array;

public class Driver2 {
	
	public static void main(String[] args) {
		
		User User1 = new User("Sonu" ,"555241");
		User User2 = new User("Ganpat" ,"45221");
		User User3 = new User("mintu" ,"4521");
		User User4 = new User("Amar" ,"78944");
		User User5 = new User("Aman" ,"85692");
		
		// Store user objects in an Array.
		
		User users[] = new User[5];
		
		users[0] = User1;
		users[1] = User2;
		users[2] = User3;
		users[3] = User4;
		users[4] = User5;
		
		System.out.println(users);
	}

}
