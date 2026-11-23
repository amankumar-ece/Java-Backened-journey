package com.kodewala.oops.mul.inheritance;
/*  
 * Diamond problem Or Death of diamond 
 */
class Account
{
	public void openAccount(String someDetails)
	{
		System.out.println("Account.openAccount()");
	}
}

class SavingAccount extends Account
{
	public void openAccount(String someDetails)
	{
		System.out.println("SavingAccount.openAccount()");
	}
}

class CurrentAccount extends Account
{
	public void openAccount(String someDetails)
	{
		System.out.println("CurrentAccount.openAccount()");
	}
}

class HybridAccount extends CurrentAccount SavingAccount
/*
 * Here jvm will confuse ,so by default jvm says we didn't allow multiple inheritance
 */
{
	
}








public class Driver {

}
