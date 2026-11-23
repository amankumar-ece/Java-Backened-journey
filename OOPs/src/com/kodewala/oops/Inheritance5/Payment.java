package com.kodewala.oops.Inheritance5;

public class Payment {
	private double amount;

	public Payment(double amount) {
		super();
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void processPayment() {
		System.out.println("processing a general payment");
	}

}
