package com.kodewala.oops.abstraction0;

public class LoginService {
	
	public boolean doLogin(String userId, String _pwd)
	{
		// connect with databases
		// Do encryption / decryption
		// business logic to validate users
		
		connectToDB();
		
		encryption();
		
		validateUser();
		
		promptpasswordReset();
		
		return true;
	}
	
	private  void connectToDB()
	{
		System.out.println("LoginService.connectToDB()...");
	}

	private void encryption()
	{
		System.out.println("LoginService.encryption()");
	}
	private void validateUser()
	{
		System.out.println("LoginService.validateuser()");
	}
	private void promptpasswordReset()
	{
		System.out.println("promptpasswordReset()");
	}
}
