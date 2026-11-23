/*
 * Class Task
 *
 */
package com.kodewala.oops.task;

public class FundTransfer {
	private String AccountHolderName;
	private long AccountNumber;
	private double Balance;

	
	
	public FundTransfer(String accountHolderName, long accountNumber, double balance) {
		super();
		this.AccountHolderName = accountHolderName;
		this.AccountNumber = accountNumber;
		this.Balance = balance;
		
	}
	
	public String getAccountHolderName() 
	{
		return AccountHolderName;
	}
	
	
	public long getAccountNumber()
	{
		return AccountNumber;
	}
	
	public  double getBalance()
	{
		return Balance;
	}
	public boolean transferFund(double amount) {

        // Only positive amount is allowed
        if (amount <= 0) {
            System.out.println("Invalid amount. Amount must be positive.");
            return false;
        }
        if (amount > Balance) {
            System.out.println("Insufficient balance.");
            return false;
        }
        Balance = Balance - amount;

        System.out.println("Fund transfer successful.");
        System.out.println("Transferred amount: " + amount);

        return true;
    }
}
	
	

