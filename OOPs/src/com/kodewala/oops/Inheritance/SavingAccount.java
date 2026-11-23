package com.kodewala.oops.Inheritance;

public class SavingAccount  extends Account
{
	public void openSavingAccount(String name, String address, String type)
	{
		// reusing the functionalities
		openBankAccount(name , address , type);
	}

}
