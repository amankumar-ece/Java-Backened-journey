package com.kodewala.oops.abstraction2;

public abstract class Vehicle {

	public abstract void calculateRent(int days);

}

class Car extends Vehicle {

	public void calculateRent(int days) {

		int rent = 2000 * days;
		System.out.println("Car rent for " + days + "days: Rs. " + rent);
	}
}
class Bike extends Vehicle 
{
	public void calculateRent(int days)
	{
		int rent = 800* days;
		System.out.println("Bike rent for " + days + "days: Rs. " + rent);
	}
}
