package com.kodewala.constructor3;

class SuperUser extends Object {
	//superUser(int a)
	{
	//	super(); // calling super class no args constructor
		// execute remaining steps if any
		
	}
}

public class User extends SuperUser {
	String userName;
	String userId;
	String mobile;

	User(String _userName, String _userId, String _mobile) {
		//super(23); // calling super class constructor without arg.
		// first line of constructor is either super or this. if you are not writing super or this.
		// Then compiler will consider super()
		//this(300); // calling same class(User)constructor
		this.userId = _userId;
		this.userName = _userName;
		this.mobile = _mobile;
	}

	User(int age) {
		System.out.println(" user() ..no arg");
	}
}
