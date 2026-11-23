package com.kodewala.exception6;

public class Driver {
 public static void main(String[] args) {
	
	 System.out.println("Driver.main() ..START");
	 PaymentMgmt mgmt = new PaymentMgmt();
	 
	 try {
		mgmt.doPayment("6255112", 12200);
	} catch (Exception e) 
	 {
		e.printStackTrace();
	}
	 
	 System.out.println("Driver.main()....END");
   }
}
