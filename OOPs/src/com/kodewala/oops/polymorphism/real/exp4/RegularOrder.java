package com.kodewala.oops.polymorphism.real.exp4;

public class RegularOrder extends FoodOrder
{
	public double calculateDeliveryCharge(double distance)
	{
		return distance * 20;
	}

}
