package com.kodewala.control.flow;

/**
 * This class is responsible for accepting booking from user.
 */

public class Booking 
{
	public String doBooking(String from, String to , int noofpax)
	{
		String pnr = null;
		if(noofpax > 6 ) // if True then only below code gets executed.
		{
			// Do not allow to Book
			System.err.println("As per IRCTC policy, only 6 pax allowed per PNR");
		}
		else
		{
			pnr = "154598";
			System.out.println("Confirming the Booking : " + pnr);
			System.out.println("Status: Confirmed");
			System.out.println("SEAT : 2 A2");
		}
		return pnr;
	}
	

}
