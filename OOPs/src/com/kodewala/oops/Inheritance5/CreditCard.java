package com.kodewala.oops.Inheritance5;

public class CreditCard extends Payment {
	
	private String cardNumber;

	public CreditCard(double amount, String cardNumber) {
		super(amount);
		this.cardNumber = cardNumber;
	}
	@Override
	public void processPayment()
	{
		System.out.println("Payment Method: Credit Card");
		System.out.println("Card Number: 12558863");
		System.out.println("Amount paid: 2500.0");
	}
	

}
