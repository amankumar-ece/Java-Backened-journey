package com.kodewala.oops.abstraction;

public class AccountMgmt {
	
	public static void main(String args[])
	{
		Account account = new Account();
		account.openAccount("Kodewala","BTM Banglore", "A55555251");
	
		/*
		account.connectWithDB();
		account.validateNameAndAddress("Kodewala","BTM Banglore");
		account.validatePan("A55544");
		account.createUserID();
		account.notify();
		*/
	}

}
