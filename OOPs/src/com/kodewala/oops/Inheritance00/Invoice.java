package com.kodewala.oops.Inheritance00;

public class Invoice extends Notification{ 
	public void generateInvoice()
	{
		System.out.println("Invoice.generateInvoice()");
		// once invoice is generated , we need to send pdf over email
		
		sendEmail("user123","please find attached invoice","path for attachement");
		
	}

}
