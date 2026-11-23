package com.kodewala.inf2;

public class FlightBooking implements IBooking
{

	@Override
	public Booking book() {
		System.out.println("FlightBooking.book()");
		return null;
	}

	@Override
	public void cancelBooking() {
		System.out.println("FlightBooking.cancelBooking()");
	}

	@Override
	public Booking checkStatus() {
        System.out.println("FlightBooking.checkStatus()");
		return null;
	}

	@Override
	public void searchResultsearch() {
		System.out.println("FlightBooking.searchResultsearch()");
	}

}
