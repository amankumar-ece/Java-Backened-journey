package com.kodewala.oops.Inheritance5;

public class Driver {

	public static void main(String[] args) {

		UPIPayment upi = new UPIPayment(1500,"aman@Upi");
		CreditCard card = new CreditCard(2500,"4588456");
		
		upi.processPayment();
		card.processPayment();
	}

}
