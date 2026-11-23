package com.kodewala.oops.polymorphism;

class InvoiceMgmt 
{
	public  void Bill() {

		System.out.println("Bill");
	}
}

class GSTInvoice extends InvoiceMgmt {
	
	public void tax()
	{
		System.out.println("TAX");
	}
	
}

public class Driver1 {

	public static void main(String[] args) {

	    GSTInvoice gstInvoice = new GSTInvoice(); // sample
		
		// parent class can refer child class objects.
		InvoiceMgmt invoiceMgmt  = (InvoiceMgmt) new GSTInvoice(); //  auto up casting
		invoiceMgmt.Bill();
		
		GSTInvoice gstInvoice1 = (GSTInvoice) new InvoiceMgmt(); // Down casting
		
		// child reference can call child specific methods
		gstInvoice1.Bill();
		// Type   ref name = Actual object
		// int     amount  = 100;
		
	}

}
