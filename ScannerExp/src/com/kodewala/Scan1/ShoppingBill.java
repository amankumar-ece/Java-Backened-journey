package com.kodewala.Scan1;

import java.util.Scanner;

public class ShoppingBill {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter customer Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter the product: ");
		String product = sc.nextLine();
		
		System.out.println("Enter product price: ");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Quantity: ");
		int quantity = sc.nextInt();
		
		System.out.println();
		
		int totalBalance = quantity * price;
		
	
		
		System.out.println("Name:"+ name);
		System.out.println("Product:"+ product);
		System.out.println("Price: "+ price);
		System.out.println("quantity: " + quantity);
		System.out.println("Total Balance: "+ totalBalance);
		
		
		sc.close();
		
		}
}
