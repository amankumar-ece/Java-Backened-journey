package com.kodewala.oops.polymorphism.real.exp5;

public class Driver {

	public static void main(String[] args) {

		BankingProcessor processor = new BankingProcessor();
		
		Yono yono = new Yono();
		processor.processPayment(yono);
	}
	
	

}
