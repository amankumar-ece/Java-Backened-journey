package com.kodewala.oops.Inheritance5;

public class UPIPayment extends Payment {
	
	private String upiId;

	public UPIPayment(double amount, String upiId) {
		super(amount);
		this.upiId = upiId;
	}
	@Override
	public void processPayment() {
		System.out.println("Payment method: UPI");
		System.out.println("UPI ID:"+ upiId);
		System.out.println("Amount paid: "+ getAmount());
		
	}

}
