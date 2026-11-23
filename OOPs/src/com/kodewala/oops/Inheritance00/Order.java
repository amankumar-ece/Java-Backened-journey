package com.kodewala.oops.Inheritance00;

public class Order extends Notification { // Notification is a parent for Order class
	public void placeOrder(String userId, String productId, String someOtherInfo)
	{
		System.out.println("Order.placeOrder()");
		//once Order placed, System/ platform need to send an update over email/sms
		
		String text = "Your order has been placed Successfully.";
		sendEmail(userId,text,"No attachment"); 
		// parent class method i am able to use.
	}
	
}
