package com.kodewala.Scan1;

import java.util.Scanner;

public class BusTicketBooking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Passenger Name: ");
		String  name = sc.nextLine();
		
		System.out.println("Bus Type: ");
		String type = sc.nextLine();
		
		System.out.println("Passenger Age: ");
		int age = sc.nextInt();
		
		System.out.println("Ticket price: ");
		int price = sc.nextInt();
		
		int discount;
		
		if(type.equals("AC"))
		{
			discount = 100;
		}
		else if (type.equals("NonAc"))
		{
			discount = 50;
		}
		else if (type.equals("Sleeper"))
		{
			discount = 80;
		}
		else
		{
			discount = 0;
		}
		
		int additionaldiscount;
		if(age >= 60)
		{
			additionaldiscount = 100;
		}
		else if (age >= 18)
		{
			additionaldiscount = 0;
		}
		else
		{
			additionaldiscount = 50;
		}
		
		int totaldiscount = discount + additionaldiscount;
		
		int finalprice = price - totaldiscount;
		
		System.out.println("Name: "+ name);
		System.out.println("Bus Type: "+ type);
		System.out.println("Age: "+ age);
		System.out.println("Ticket price: "+ price);
		System.out.println("Bus discount: "+ discount);
		System.out.println("Age discount: "+ additionaldiscount);
		System.out.println("Total discount: "+ totaldiscount);
		System.out.println("Final Bill: "+ finalprice);
		
	}

}
