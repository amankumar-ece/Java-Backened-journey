package com.kodewala.control.flow3;

public class Driver {

	public static void main(String[] args) {
       
		Shopping shopping = new Shopping();
		
		String discount = shopping.CalculateDiscount("GOLD", 12000);
		
		System.out.println("Discount: " + discount);
	}

}
