package com.kodewala.oops.polymorphism2;

public class FoodOrder {
	public void calculateDeliveryCharge()
	{
       
       System.out.println("Delivery Charge Details: ");
       		   
	}

}
class RegularOrder extends FoodOrder
{
	public void calculateDeliveryCharge()
	{
		int regular = 30;
		System.out.println("Regular Order Charges: " + regular);
	}
}

class ExpressOrder extends FoodOrder
{
	public void trackExpressDelivery()
	{
		int express = 80;
		System.out.println("Express Order Charges:"+ express);
	}
}

