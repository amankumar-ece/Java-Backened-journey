package com.kodewala.Scan1;

import java.util.Scanner;

public class FoodDeliveryBill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	 System.out.println("Customer Name: ");
	 String name = sc.nextLine();
	 
	 System.out.println("Food Type: ");
	 String type = sc.nextLine();
	 
	 System.out.println("Food price: ");
	 int price = sc.nextInt();
	 
	 System.out.println("Quantity: ");
	 int quantity = sc.nextInt();

	int  totalAmount = price * quantity;
	
	int discount;
	if (type.equals("pizza"))
	{
		discount = 100;
	}
	else if(type.equals("Burger"))
	{
		discount = 50;
	}
	else if(type.equals("Biryani"))
	{
		discount = 80;
	}
	else
	{
		discount = 0;
	}
	int finalAmount = totalAmount - discount;
	
	System.out.println();
	
	System.out.println("Name: "+ name);
	System.out.println("Food Type: "+ type);
	System.out.println("Food Price: "+ price);
	System.out.println("Food quantity: "+ quantity);
	System.out.println("Total Amount: "+ totalAmount);
	System.out.println("Discount: "+ discount);
	System.out.println("Final Bill: "+ finalAmount);
	
	
	}

}
