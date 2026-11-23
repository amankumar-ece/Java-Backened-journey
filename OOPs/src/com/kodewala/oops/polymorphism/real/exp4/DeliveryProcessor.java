package com.kodewala.oops.polymorphism.real.exp4;

public class DeliveryProcessor {
	
	// (FoodOrder order) is the parent-class reference accepted by the method.
public void printDeliveryCharge(FoodOrder order, double distance)
{
	double FoodOrderCharge =  order.calculateDeliveryCharge(distance);
	// order.calculateDeliveryCharge(distance) calls the overridden method of the actual object at runtime.
	
    System.out.println("Distance: " + distance + "km");
    System.out.println("Delivery Charge: " + FoodOrderCharge);
    System.out.println(".............");
}

}
