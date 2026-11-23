package com.kodewala.Scan1;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Customer Name:");
		String name = sc.nextLine();
		
		System.out.println("Food Item:");
		String item = sc.nextLine();
		
		System.out.println("Price:");
		int price = sc.nextInt();
		
		System.out.println("quantity: ");
		int quantity = sc.nextInt();
		
		System.out.println();
		
		int total = quantity * price;
		
		if (total >= 1000)
		{
			int totaldiscount = total -100;
		}
		else
		{
			int discount = 0;
		}
		
		System.out.println("Name: "+name);
		System.out.println("Item: "+ item);
		System.out.println("Price: "+ price);
		System.out.println("quantity: "+ quantity);
		System.out.println("TOTAL Bill: "+ total);
		
		sc.close();		
	}
}
