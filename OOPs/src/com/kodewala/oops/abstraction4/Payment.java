package com.kodewala.oops.abstraction4;

public abstract class Payment {
	
	public abstract void makePayment(double amount);

}

class UPIPayment extends Payment
{
	public void makePayment(double amount)
	{
		System.out.println("UPI payment:  " + amount);
	}
}

class CreditCardPayment extends Payment
{
	public void makePayment(double amount)
	{
		System.out.println("Credit Card Payment: " + amount);
	}
	
}

class PaymentMethod
{
	public static void main(String[] args) {
		
		Payment upi = new UPIPayment();
		Payment credit = new CreditCardPayment();
		
		upi.makePayment(5);
		credit.makePayment(5);
	}
}