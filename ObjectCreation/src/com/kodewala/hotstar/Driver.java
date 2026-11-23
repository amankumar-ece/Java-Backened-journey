package com.kodewala.hotstar;

import com.kodewala.hotstar.User.User;
public class Driver {

	public static void main(String[] args) {
		
	 User u1 = new User("Guest" , "Free");
	 User u2 = new User("Guest" , "Free");	
	 User u3 = new User("Guest" , "Free");
	 
	 User u4 = new User("Kodewala", "Kw1234", "Paid");
	 User u5 = new User("Aman" , "Aman6202","paid");
	 
	 System.out.println("Total live Users are: " + User.liveUserCount);
	}

}
