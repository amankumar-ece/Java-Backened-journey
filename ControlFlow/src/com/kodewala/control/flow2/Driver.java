package com.kodewala.control.flow2;

public class Driver {

	public static void main(String[] args) {
		
		MakeMyTrip fare = new MakeMyTrip();
		
		String discount = fare.makeMyTrip("BLR", 10000 );
		
		System.out.println(discount);
	}

}
