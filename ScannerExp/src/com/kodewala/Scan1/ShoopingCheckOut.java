package com.kodewala.Scan1;

import java.util.Scanner;

public class ShoopingCheckOut {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Customer Name:");
		String name = sc.nextLine();

		System.out.println("Membership Type:");
		String type = sc.nextLine();

		System.out.println("Purchase Amount: ");
		int amount = sc.nextInt();
		
		System.out.println("Have a coupon? (yes/No): ");
		String coupon = sc.nextLine();

		int discount;
        if(amount >=1000) 
        {
		if (type == "Gold") 
		{
			discount = amount* 20 / 100;
		} 
		else if (type == "Silver")
		{
			discount = amount* 10 / 100;
		} else if (type == "Regular")
		{
			discount = amount* 5 / 100;
		}

		int MinimumPurchasAmount;
		{
			amount = 100;
		}

		int MaximumDiscount;
		{
			MaximumDiscount = 2500;
		}

		
		if(discount > 2500)
		{
			discount = 2500;
		}
		
		int additionalDiscount = 0;
		if(coupon.equalsIgnoreCase("Yes")&& amount >= 2000)
		{
			additionalDiscount = 1000;
			
		}
		
		int totalDiscount =  discount + additionalDiscount;
		
		if(totalDiscount > amount) {
			totalDiscount = amount;
		}
        int finalAmount = amount -totalDiscount;
        
        System.out.println();
	}

	}
}