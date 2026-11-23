package com.kodewala.oops.revise.Encap;
/*
 * Encapsulation: Hiding the data
 * Abstraction: Hiding the core functionalities and 
 *              exposing the require function for user
 */
public class Account {

	public int balance;

	// This method will modify the balance
	public void credit() {
		// check the balance of sender
		checkBalance();
		// check the pin of sender
		validatepin("abc");
		// debit the amount
		// credit the amount --> 0 ---> 100
		System.out.println("Account.Credit()....doing fund transfer...");
	}

	private int checkBalance() {
		System.out.println("Account.checkBalance()");
		return 2000;

	}

	private boolean validatepin(String userId) {
		System.out.println("Account.validatePin().....");
		return true;
	}
}