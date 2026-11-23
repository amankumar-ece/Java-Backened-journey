package com.kodewala.exception4;

public class UserRegistration {
	
	public boolean registerUser(String _email)
	{
		String email = _email;
		
		// logic to check the email...with DB and if already available then return true 
		boolean isEmailRegistered = true;
		if (isEmailRegistered)
		{
			throw new EmailAlreadyExistsException(" Email id " + " already registered ");
			// new person("test");
		}
		
		return true;
	}

}
