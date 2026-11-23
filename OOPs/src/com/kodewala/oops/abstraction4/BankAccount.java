package com.kodewala.oops.abstraction4;

public abstract class BankAccount {
	public abstract void displayBalance();
	{
String AccountHolder;
int  balance;

public BankAccount(String accountHolder, int balance) {
	super();
	this.AccountHolder = accountHolder;
	this.balance = balance;
}

public void displayBalance() {
	System.out.println("Account Holder:" + accountHolder);
	System.out.println("Balance Rs. " + balance);
}

public abstract void calculateInterest();
	}
	
class SavingAccount extends BankAccount
{
	public SavingAccouny(String accountHolder, int balance) {
		
		super(accountHolder,balance);
		
	}
	@Override
	}
}
