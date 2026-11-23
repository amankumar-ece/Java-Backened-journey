package com.kodewala.Objects;

public class User {
	String userName;
	String userID;
	String mobileNumber;
	
	// static Block Will get executed just after the class loading.
	static
	{
		System.out.println("i am in static init Block1");
	}
	
	static
	{
		System.out.println("i am in static init Block2");
	}
	
	static
	{
		System.out.println("i am in static init Block3");
	}

	public User(String userName, String userID, String mobileNumber)
	{
		super(); // either Super or this
		System.out.println("User.user(String userName, String userId, String mobileNumber)...constructor");
		this.userName = userName;
		this.userID = userID;
		this.mobileNumber = mobileNumber;
	}

}
