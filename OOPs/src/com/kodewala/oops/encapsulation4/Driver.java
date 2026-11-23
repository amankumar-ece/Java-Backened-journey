package com.kodewala.oops.encapsulation4;

public class Driver {

	public static void main(String[] args) {

		MovieTicket ticket = new MovieTicket("Aman" , "Avengers", 2 , 250);
		
		System.out.println("Customer Name: " + ticket.getCustomerName());
		System.out.println("Movie Name: "+ ticket.getMovieName());
		System.out.println("Tickets:" + ticket.getNumberOfTickets());
		System.out.println("Price per Ticket: "+ ticket.getTicketPrice());
		System.out.println("Total cost: "+ ticket.calculateTotal());
	}

}
