package com.kodewala.oops.polymorphism.real.exp3;

public class Driver {
	
	public static void main(String[] args) {
		
		// create shoopingCartProcessorDiscount 
		ShoopingCart cart = new ShoopingCart();
	
        ShoopingCartDiscount discount = new FestivalDiscount();
       // referenceType                     Actual Object
        cart.printDiscount(discount, 5000);
        
        discount = new MemberDiscount();
        cart.printDiscount(discount, 5000);
		
		discount = new StudentDiscount();
		cart.printDiscount(discount, 5000);
		
		
		
		
	}

}
