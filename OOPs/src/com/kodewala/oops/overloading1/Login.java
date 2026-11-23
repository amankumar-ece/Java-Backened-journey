package com.kodewala.oops.overloading1;
/*
 * Overloading is the multiple versions of the matter.
 * Rules:
 *  Same method name But different parameters
 *  Giving flexibility to client or user based on the requirement.
 *  overloading happens within the class.
 *  
 */

public class Login {
	public void doLogin(String mobile, int otp) // v1
	{
		System.out.println("Login.doLogin(String mobile , int otp)");
	}
	
	public String doLogin(String email, String password) // v2
	{
		System.out.println("Login.doLogin(String email, String password)");
		return "Some value";
	}
	
	public void doLogin(String gmail) // v2
	{
		System.out.println("Login.doLogin(String gmail)");
	}

}
