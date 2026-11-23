package com.kodewala.oops.polymorphism.real.exp2;

public class CarDelivery extends DeliveryService
{
	@Override
	public void calculateDeliveryCharge(int distance)
	{
		System.out.println("Car Delivery Charge: "+ distance* 10);
	}

}
