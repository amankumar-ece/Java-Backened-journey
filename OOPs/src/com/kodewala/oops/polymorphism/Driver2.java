package com.kodewala.oops.polymorphism;

class Delivery
{
	public void doDeliver()
	{
		System.out.println("Delivery.doDeliver()");
	}
}

class EcomDelivery extends Delivery
{
	public void doDeliver()
	{
		System.out.println("EcomDelivery.doDeliver()");
	}
}

public class Driver2 {

	public static void main(String[] args) {

		Delivery delivery = new EcomDelivery(); // Parent class can refer child class object(auto up casting)
		
		delivery.doDeliver();  // compile type it check + it call based on actual object
	}

}
