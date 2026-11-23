package com.kodewala.oops.polymorphism.real.exp2;

public class TruckDelivery extends DeliveryService
{
	@Override
	public void calculateDeliveryCharge(int distance)
	{
		System.out.println("Truck Delivery Charge: "+ distance *10);
	}

}
