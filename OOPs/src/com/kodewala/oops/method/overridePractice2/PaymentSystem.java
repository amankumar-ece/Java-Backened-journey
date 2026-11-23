package com.kodewala.oops.method.overridePractice2;
/*
 * Write a program to develop payment system.(use inheritance and method overriding)

    PaymentSystem > pay() > doing payment

    PhonePay > pay() > doing phonepay payment

     Gpay > pay() > doing gpay payment
 */
public class PaymentSystem {
	
	public void showpayment()
	{
		System.out.println("Doing Payment...");
	}


class Phonepay extends PaymentSystem {
	public void showpayment()
	{
		System.out.println("Doing phone pay payment!!");
	}
}

class Gpay extends PaymentSystem
 {
	public void showpayment()
	{
		System.out.println("Doing GPay payment...");
	}
}

class Transaction{
	public void main(String[] args) {
		PaymentSystem pay = new PaymentSystem();
		pay.showpayment();
		
		Phonepay phone = new Phonepay();
		phone.showpayment();
		
		Gpay gp = new Gpay();
		gp.showpayment();
		
	}
  }
}