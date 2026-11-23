package com.kodewala.oops.encapsulation;

public class BankAccount {
	
	private String accountHolderName;
	private long accountNumber;
	private double balance;
	
	// creating constructor 
	public BankAccount(String accountHolderName, long accountNumber, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	// getter
	public String getaccountHolderName()
	{
		return accountHolderName;
	}
	
	public long getaccountNumber()
	{
		return accountNumber;
	}
	
	public double getbalance()
	{
		return balance;
	}
	
	// withdrawal method 
	public boolean withdraw(double amount) {
		
		if(amount <= 0 ) {
			System.out.println("Invalid Amount. Amount must be positive");
			return false;
		}
		
		if (amount > balance) {
			System.out.println("Insufficient Balance");
			return false;
		}
		balance = balance - amount;
		
		System.out.println("Withdrawal successful.");
		System.out.println("Withdrawal Amount: " + amount);
		
		return true;
	}
	
}


