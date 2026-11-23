package com.kodewala.oops.Inheritance3;
/*
 * Disadvantages of Inheritance
 * 1. Tightly couple
 * 2. Heavy Loading 
 * 
 */
class Account
{
	public void openAccount(String usreId, String email) // x--> x+1
	{
		System.out.println("Account.openAccount()");
	}
}

class SavingAccount extends Account
{ 
	@Override // changing the super class method's functionalities.
	
	public void openAccount(String userId, String email)
	{
		System.out.println("SavingAccount.openAccount()");
		
	}
}
class SrcitAccount extends SavingAccount
{
	@Override
	public void openAccount(String userId ,String email)
	{
		System.out.println("SrcitAccount.openAccount()");
	}
}
class pensionAccount extends SrcitAccount
{
	@Override
	public void openAccount(String userId, String email)
	{
		System.out.println("PensionAccount.openAccount()");
	}
}


public class Driver {

	public static void main(String[] args) {

	}

}
