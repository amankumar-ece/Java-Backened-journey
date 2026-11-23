package com.kodewala.inf05;

class SavingsAccount implements Printable  {
	int accountNo;
	String accountHolder;
	double balance;
	public SavingsAccount(int accountNo, String accountHolder, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
}	
class DataProcessor {
	public  void printDetails(Object  obj)
	{
		if( obj instanceof Printable)
		{
			SavingsAccount acc = (SavingsAccount)obj;
			
			System.out.println("Account No: "+ acc.accountNo);
			System.out.println("Account Holder: "+ acc.accountHolder);
			System.out.println("Balance: "+ acc.balance);
			}
		else
		{
			System.err.println();
		}
	}
}
class Driver {
	public static void main(String[] args) {
		
		SavingsAccount acc = new SavingsAccount(6521,"542215", 4551.1);
		
		DataProcessor dataProcessor = new DataProcessor();
		dataProcessor.printDetails(acc);
	}
		
}
