package com.kodewala.oops.abstraction;

public class Accounts {
	// responsible for opening an account
   //RBI --> one pan can should not have more than 5 Account
	public boolean openAccount(String name, String address, String pan)
	{
		connectWithDB();
		validateNameAndAddress(name,address);
		validatePan(pan);
		findAccountByPanCard(pan);
		createUserID();
		notify();
		return true;
	}
	//core functionalities
	private boolean validateNameAndAddress(String name, String address)
	{
		System.out.println("Account.validNameAndAddress...validating");
		return true;
	}
	//core functionalities
	private boolean validatePan(String pan)
	{
		System.out.println("Account.Validatepan()...validating pan");
		return true;
	}
	//core functionalities
	private void connectWithDB()
	{
		System.out.println("Account.connectwithDB()....DB connection");
	}
	// core functionalities
	private String createUserID() 
	{
		System.out.println("Account.createUserID()...Creating user id...");
		return "some User id...";
	}
	// core functionalities
	private void notifyUser()
	{
		System.out.println("Account.notifyUser()...Sending notification to user");
	}
	private int findAccountByPanCard(String pan)
	{
		System.out.println("Account.findAccountByPanCard()...finding total account");
		return 3;
	}
}
