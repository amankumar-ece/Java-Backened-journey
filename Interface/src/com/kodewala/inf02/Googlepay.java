package com.kodewala.inf02;

public class Googlepay implements Payment {

	@Override
	public void pay() {
		System.out.println("Googlepay.pay()");
	}

	@Override
	public void refund() {
	    System.out.println("Googlepay.refund()");
	}

	@Override
	public void cancelPayment() {
		System.out.println("Googlepay.cancelPayment()");
	}

}
