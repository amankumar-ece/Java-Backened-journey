package com.kodewala.oops;

// This class is not welll encapsulated
public class Account {
	private int balance; // Data or variable --> other classes can change this variable  

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	// setter
	public void doDebit(int _amount)
	{
		// Modifying the data
		balance = balance - _amount;
	}
	
	public void doCredit(int _amount)
	{
		if(_amount > 0) {
			// Modifying the data
			balance = balance + _amount;
		}
	}
  public int getBalance()
  {
	  return balance;
  }
}
