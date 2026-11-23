package com.kodewala.Objects;

class AccountMgmt
{
	public AccountMgmt() {
		System.out.println("AccountMgmt.AccountMgmt()...");
	}
}

public class Account extends AccountMgmt
{
	static
	{
		System.out.println("Account.SIB");
	}
	String accountNumber;
	
	public Account(String accountNumber)
	{
		super(); //1st line 
		// call to init block ---> IIB ---> 2nd line
		System.out.println("Account(String acccountNumber)");
		this.accountNumber = accountNumber;
	}
	
	// Instance Init Block --> This will get executed whenever object is created.
	{
		System.out.println("Account IIB ");
	}
}
