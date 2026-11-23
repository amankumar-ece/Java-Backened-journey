package com.kodewala.oops.polymorphism.real.exp4;

public class Driver {

	public static void main(String[] args) {

		DeliveryProcessor processor = new DeliveryProcessor();
		
		FoodOrder order = new RegularOrder();
		processor.printDeliveryCharge(order, 5);
		
		order = new PremiumOrder();
		processor.printDeliveryCharge(order, 5);
		
		order = new ExpressOrder();
		processor.printDeliveryCharge(order, 5);
		
		
	
	}

}
