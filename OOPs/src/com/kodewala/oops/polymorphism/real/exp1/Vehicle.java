package com.kodewala.oops.polymorphism.real.exp1;

public class Vehicle {
	public void calculateRent(int days)
	{
		System.out.println("Vehicle Rent: "+ days);
	}

}

class Car extends Vehicle 
{
	public void calculateRent(int days)
	{
		int Carrate = 5;
		System.out.println("Car Rate:"+ Carrate * days);
	}
}

class Bike extends Vehicle
{
	public void calculateRent(int days)
	{
		int Bikerate = 10;
		System.out.println("Bike Rate:"+ (Bikerate*days));
	}
}
class Bus extends Vehicle 
{
	public void claculateRent(int days)
	{
		int Busrate= 15;
		System.out.println("Bus Rate: " + (Busrate*days));
	}
}

class VehicleRentProcessor
{
public void calculateRent(Vehicle vehicle, int days)
{
	vehicle.calculateRent(days);
	}
}

class TotalRent 
{
	public static void main(String[] args) {
		
		VehicleRentProcessor processor = new VehicleRentProcessor();
		
		Car car = new Car();
		processor.calculateRent(car,2);
		
		Bike bike = new Bike();
		processor.calculateRent(bike,5);
		
		Bus bus = new Bus();
		processor.calculateRent(bus,8);
	}
}