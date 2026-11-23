	package com.kodewala.oops.polymorphism.real.exp2;
	
	public class BikeDelivery extends DeliveryService
	
	{
		@Override
		public void calculateDeliveryCharge(int distance)
		
		{
			System.out.println("Bike Delivery Charge: "+ distance *10);
		}
	
	}
	
