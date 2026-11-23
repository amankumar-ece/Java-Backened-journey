package com.kodewala.inf2;

public interface IBooking 

	/*
	 *  in 2010 - MMT(Make my Trip)
	 */
	
{
	// What to do
	public abstract Booking book();
	public abstract void cancelBooking();
	public abstract Booking checkStatus();
	public abstract void  searchResultsearch();
	
	//optional -- 2020
	public default void autoUpgrade() // to some of the classes
	{
		System.out.println("IBooking.autoUpgrade()..........");
	}
}
