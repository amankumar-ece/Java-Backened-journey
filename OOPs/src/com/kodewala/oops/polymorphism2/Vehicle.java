package com.kodewala.oops.polymorphism2;

public class Vehicle {
	public void  start()
	{
		System.out.println("Vehicle starting....");
	}
	
}

class Car extends Vehicle
{
	public void start()
	{
		System.out.println("Car Starting....");
	}
}

class Bike extends Vehicle
{
	public void start()
	{
		System.out.println("Bike starting....");
	}
}

class Bus extends Vehicle
{
	public void start()
	{
		System.out.println("Bus starting....");
	}
	
}

class Starting 
{
	public static void main(String[] args) {
		
		// upcasting 
		Vehicle vehicle = new Car();
		vehicle.start();
		
		Vehicle v1 = new Bike();
		v1.start();
		
		Vehicle v2 = new Bus();
		v2.start();
	}
}