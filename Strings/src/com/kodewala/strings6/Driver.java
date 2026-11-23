package com.kodewala.strings6;


// Final class can not become parent.
public class AccountMgmt // This class can not become parent. {
{
	 // int max_value =100;
	final int UPI_LIMIT = 100000; //constant in java (Naming convention for constant is capital)
	
	public final void doSomething1()
	{
		// max_value = 200;
		// Some func....android
		UPI_LIMIT = 200000; // able to change the values
	}
	public void doSomething2()
	{
		// some func......android phn 
	}

}
class Account extends AccountMgmt
{
	// iphone
	@Override
	public  void doSomething2()
	{
		
	}
	
public class Driver{
	
	public void main(String[] args)
	{
		
	}
}
}