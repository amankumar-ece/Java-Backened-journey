package com.kodewala.inf04;

class Account {
	int balance;
	String accountNo;
	String atmPin;
	
	public Account(int balance, String accountNo, String atmPin) {
		super();
		this.balance = balance;
		this.accountNo = accountNo;
		this.atmPin = atmPin;
	}
	
}

class DataProcessor {
	public void printDetails(Object obj) 
	{
		if(obj instanceof DataPrintable) // it will be true if Account class implements DataPrintable() 
		{
		Account acc = (Account)obj;
		System.out.println("Account: "+ acc.accountNo);
		System.out.println("Atm Pin: "+acc.atmPin);
		System.out.println("Balance: "+acc.balance);
	}
		else
		{
			System.err.println("DataNotPrintableException");
		}
     }
}
public class Driver {

	public static void main(String[] args) {
		
		Account acc = new Account(1000, "1234567890", "1234");
		
		DataProcessor dataProcessor = new DataProcessor();
		dataProcessor.printDetails(acc);
	}
	
}
