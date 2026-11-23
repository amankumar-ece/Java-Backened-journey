package com.kodewala.inf02;

public class PhonePe implements Payment{

	@Override
	public void pay() {
		System.out.println("PhonePe.pay()");
	}

	@Override
	public void refund() {
		System.out.println("PhonePe.refund()");
	}

	@Override
	public void cancelPayment() {
		System.out.println("PhonePe.cancelPayment()");
	}

}
