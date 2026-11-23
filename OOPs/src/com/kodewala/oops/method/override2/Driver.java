package com.kodewala.oops.method.override2;

class paymentSystem // super class of UPI
{
	GenericResponse doPayment(String accNo, int amount, String note)
	{
		System.out.println("PaymentSystem.dopayment().....");
		
		return new GenericResponse("default payment");
	}
}

class UPI extends paymentSystem
{
	
	@Override // check all the rules for overriding...
	protected UPIResponse doPayment(String accNo, int amount, String note)
	{
		// change the functionalities..
		System.out.println("UPI.dopayment()");
		
		return new UPIResponse("default payment","200");
	}
}

public class Driver {
	public static void main(String[] args) {
	
		paymentSystem pay = new paymentSystem();
		pay.doPayment("12455" , 500, "ten");
	}
	
	
}
