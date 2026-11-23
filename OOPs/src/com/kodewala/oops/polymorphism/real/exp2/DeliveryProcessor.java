package com.kodewala.oops.polymorphism.real.exp2;

public class DeliveryProcessor {
	 // Accepts a parent-class reference.
    // Any object of DeliveryService or its subclasses
    // can be passed to this method.
	public  void processDelivery(DeliveryService service, int distance)
	{
		service.calculateDeliveryCharge(distance);
		 // Runtime polymorphism happens at this call.
        // Java executes the overridden method belonging
        // to the actual object.
	}

}
