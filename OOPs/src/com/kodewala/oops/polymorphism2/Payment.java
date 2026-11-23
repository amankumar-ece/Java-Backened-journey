package com.kodewala.oops.polymorphism2;

public class Payment {

	public void processPayment() {
		
		System.out.println("Payment Type: ");
	}
}

class UPIPayment extends Payment
{
	public void showUPIDetails()
	{
		System.out.println("UPI Details: ");
	}
}

class CardPayment extends Payment
{
	public void showCardDetails()
	{
		System.out.println("Card Details: ");
	}
}

class PaymentMethod
{
	public static void main(String[] args) {
		
		/*
		// UPcasting --> parent class can refer child class object
		Payment payment = new UPIPayment();
		payment.processPayment();
		
		
		CardPayment cardpayment = new  CardPayment();
		cardpayment.showCardDetails();
		
		UPIPayment upipayment = new UPIPayment();
		upipayment.showUPIDetails();
		
		*/
		
		// DownCasting--> child reference can call child specific methods
		
		Payment payment = new UPIPayment(); // upcasting 
		
	    UPIPayment upipayment = (UPIPayment) payment; //Downcasting
	    upipayment.showUPIDetails();
	    
		
		
	}
}