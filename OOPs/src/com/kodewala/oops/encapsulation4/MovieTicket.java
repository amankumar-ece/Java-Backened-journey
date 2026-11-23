package com.kodewala.oops.encapsulation4;

public class MovieTicket {
	private String CustomerName;
	private String MovieName;
	private int numberOfTickets;
	private double ticketPrice;
	
	public MovieTicket(String customerName, String movieName, int numberOfTickets, double ticketPrice) {
		super();
		this.CustomerName = customerName;
		this.MovieName = movieName;
		this.numberOfTickets = numberOfTickets;
		this.ticketPrice = ticketPrice;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	public boolean bookTickets(int count){
		
		if(count <=0)
		{
			System.out.println("Ticket count must be greater than Zero.");
			return false;
		}
		
		// Add tickets to the existing count
		this.numberOfTickets += count;
		System.out.println("Tickets booked successfully.");
		return true;
		
	}
	// cancel booked tickets
	public boolean cancelTickets(int count) {
		if(count > this.numberOfTickets) {
			System.out.println(" Ticket count must be greater than zero.");
			return false;
		}
		
		// check whether enogh tickets are booked
		if(count > this.numberOfTickets) {
			System.out.println("cannot cancel more tickets than booked");
			return false;
		}
		// subtract cancelled  tickets 
		this.numberOfTickets -= count;
		System.out.println("Tickets cancelled successfully.");
		return true;
		
	}
	// calculate the total cost
	public double  calculateTotal() {
		return numberOfTickets * ticketPrice;
	}
	
	// Display all booking details
    public void displayTicketDetails() {
    	System.out.println("Customer Name: " + CustomerName);
    	System.out.println("Movie Name: " + MovieName);
    	System.out.println("Number of  Tickets: " + numberOfTickets);
    	System.out.println("Ticket Price: " + ticketPrice);
    	System.out.println("Total Cost: " + calculateTotal());
    }
	
	
}
