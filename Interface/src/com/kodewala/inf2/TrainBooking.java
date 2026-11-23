package com.kodewala.inf2;

public class TrainBooking implements IBooking
{

	@Override
	public Booking book() {
		System.out.println("TrainBooking.book()");
		return null;
	}

	@Override
	public void cancelBooking() {
       System.out.println("TrainBooking.cancelBooking()");		
	}

	@Override
	public Booking checkStatus() {
	  System.out.println("TrainBooking.checkStatus()");
		return null;
	}

	@Override
	public void searchResultsearch() {
      System.out.println("TrainBooking.searchResultsearch()");
		
	}

}
