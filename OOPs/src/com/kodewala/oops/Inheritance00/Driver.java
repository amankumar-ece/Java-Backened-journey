package com.kodewala.oops.Inheritance00;

class AccountMgmt  // parent of Account class
{
	String ifscCode = "SBIN001";
	
	public void doFundTransfer()
	{
		System.out.println("AccountMgmt.doFundTransfer()...500 lines");
	}
}

class Account extends AccountMgmt // Account class is child of AccountMgmt
{
	public void pay()
	{
		Account account = new Account();
		System.out.println(account.ifscCode); // re-using the parent class attributes in child class
		account.doFundTransfer();  // We are re-using parent class method
		}
}

public class Driver {

	public static void main(String[] args) {

	}

}
