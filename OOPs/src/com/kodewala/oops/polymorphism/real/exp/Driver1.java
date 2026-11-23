package com.kodewala.oops.polymorphism.real.exp;

public class Driver1 {

	public static void main(String[] args) {

		Signup signup = new Signup();
		
		signup.doRegister("2541-5545-5575"); // compile time polymorphism
		
		signup.doRegister("Amn5541", 4454);
		
	}

}
