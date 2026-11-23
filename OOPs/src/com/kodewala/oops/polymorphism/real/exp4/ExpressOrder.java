package com.kodewala.oops.polymorphism.real.exp4;

public class ExpressOrder extends FoodOrder
{
	public double calculateDeliveryCharge(double distance)
	{
		return distance*40;
	}

}
