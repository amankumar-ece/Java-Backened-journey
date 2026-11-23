package com.kodewala.oops.polymorphism.real.exp;

public class Driver {

	public static void main(String[] args) {

		Paymentprocessor processor = new Paymentprocessor();
		
		UPIPayment upipayment = new UPIPayment();
		processor.processPayment(upipayment);
		
		CardPayment cardPayment = new CardPayment();
		processor.processPayment(cardPayment);
		
		Payment payment = new Payment();
		processor.processPayment(payment);
		
		PhonePay phonepay = new PhonePay();
		processor.processPayment(phonepay);
	}
	
}
