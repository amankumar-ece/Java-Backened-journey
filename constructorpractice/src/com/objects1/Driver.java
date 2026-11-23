/*
 * SIB - Static init block 
 * 
 * IIB - Instance init block
 * 
 * 1. payment class will be loaded into memory
 * 2. Static block will be called
 * 3. Execute main method
 * 
 */

package com.objects1;

class Payment {
	{
		System.out.println("Inside IIB");
	}

	public Payment() {
		// 1 line - super() OR this()
		// 2nd call to init block
		System.out.println("inside payment() constructor");
	}
	public Payment(int _amt) {
		
		System.out.println("payment.paymet _amt");	
		}

	public static void main(String[] args) {
		
		System.out.println("payment.main()");
		
		Payment payment = new Payment();
		
		Payment payment1 = new Payment(100);
	}
	
	static {
		System.out.println("inside SIB...Only once....");
	}
}

public class Driver {
	public static void main(String[] args) {

		Payment p = new Payment();
	}

}
