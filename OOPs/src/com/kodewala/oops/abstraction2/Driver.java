package com.kodewala.oops.abstraction2;

public class Driver {

	public static void main(String[] args) {

		Vehicle Car = new Car();
		Vehicle Bike = new Bike();
		
		Car.calculateRent(3);
		Bike.calculateRent(3);
	}

}
