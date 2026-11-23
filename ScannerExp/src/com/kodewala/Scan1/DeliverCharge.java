package com.kodewala.Scan1;

import java.util.Scanner;

public class DeliverCharge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter customer Name: ");
		String name = sc.nextLine();
		
		System.out.println("Order Amount: ");
		int amount = sc.nextInt();
		
		int deliveryCharge;
		
		if (amount >=5000)
		{
			deliveryCharge = 0;
		}
		
		else if (amount >= 2000)
		{
			deliveryCharge = 50;
		}
		else if (amount >= 500)
		{
			deliveryCharge = 100;
		}
		else
		{
			deliveryCharge = 150;
		}
		
		int finalAmount = amount + deliveryCharge;
		
		System.out.println("Name: "+ name);
		System.out.println("Order Amount: "+ amount);
		System.out.println("Delivery charge: "+ deliveryCharge);
		System.out.println("Total Price: "+ finalAmount);
		
		sc.close();

	}

}
