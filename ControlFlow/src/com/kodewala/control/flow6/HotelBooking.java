package com.kodewala.control.flow6;

public class HotelBooking {

	public static void main(String[] args) {
		
		HotelBooking booking = new HotelBooking();
		String customertype = args[0];
		double bookingAmount = Double.parseDouble(args[1]);
	    booking.calculateDiscount(customertype , bookingAmount);

	}
	
	public void calculateDiscount(String customertype , double bookingAmount) {
		
		if(bookingAmount < 2000) {
			
			System.out.println("Minimum Booking amount should be 2000 ");
			return;
		}
		
		double discount =0;
		
		switch (customertype.toLowerCase()) {
		case "premium":
			
			discount = bookingAmount * 15/100;
			break;
		
			case "member":
				
				discount = bookingAmount * 10/100;
				break;
		
			case "regular":
					
			 discount = bookingAmount * 5/100;
					break;
		default:
			System.out.println("Invalid customer Type ");
			break;
		}
		if (discount > 1500) {
			
			discount =1500;
		}
		System.out.println("Customer Type: "+ customertype);
		System.out.println("Booking Amount: "+ bookingAmount);
		System.out.println("Discount: "+ discount);
		System.out.println("Final Amonunt: "+ (bookingAmount-discount));
	}
}

