package com.kodewala.oops.polymorphism.real.exp2;

public class Driver {
	public static void main(String[] args) {
		
		// create the processor object
		DeliveryProcessor process = new DeliveryProcessor();
	
		DeliveryService delivery = new DeliveryService();
	//  Reference	    Type     =     ActualObject
		delivery.calculateDeliveryCharge(0);
		
		BikeDelivery bike = new BikeDelivery();
   //	Reference    Type =     ActualObject	       
		process.processDelivery(bike, 5);
		
		CarDelivery car = new CarDelivery();
		process.processDelivery(car, 50);
		
		TruckDelivery truck = new TruckDelivery();
		process.processDelivery(truck, 1000);
				
		
	}
 
}
