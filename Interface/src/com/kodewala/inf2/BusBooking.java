package com.kodewala.inf2;
/*
 * This class is implementing IBooking interface and must implement all the abstract method of
 * IBooking interface. (100% contract)
 */
public class BusBooking implements IBooking

{

	@Override
	public Booking book() {
		System.out.println("BusBooking.book()");
		return null;
	}

	@Override
	public void cancelBooking() {
	
		System.out.println("BusBooking.cancelBooking()");
	}

	@Override
	public Booking checkStatus() {
		System.out.println("BusBooking.checkStatus()");
		return null;
	}

	@Override
	public void searchResultsearch() {
		System.out.println("BusBooking.searchResultsearch()");
		
	}
	
}

	