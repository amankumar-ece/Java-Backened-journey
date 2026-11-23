package com.kodewala.Scan1;

import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter coustomer Name: ");
		String name = sc.nextLine();
				
        System.out.println("Age:");
        int age = sc.nextInt();
        
        System.out.println("Ticket Price:");
        int price = sc.nextInt();
        
        System.out.println();
        
        int discount;
       	
        if (age >= 60)
        {
        	discount = 100;
        }
        else if (age >= 18)
        {
        	discount = 50;
        }
        else
        {
        	discount = 20;
        }
        
       int  finalprice = price - discount;
       
       System.out.println("Name:"+ name);
       System.out.println("Age:"+ age);
       System.out.println("Ticket price: "+ price);
       System.out.println("Discount: "+ discount);
       System.out.println("Total price: " + finalprice);
	}

}
