package com.kodewala.oops.polymorphism.real.exp;

public class Signup {
	
	public boolean doRegister(String panCard, int otp)
	{
		System.out.println("Signup.doRegister()");
		return true;
	}


public boolean doRegister(String panCard , String passport)
{
	System.out.println("Signup.doRegister()");
	return true;
	
}

public boolean doRegister(String aadhar) {
	System.out.println("Signup.doRegister()");
	return true;
   }
}
