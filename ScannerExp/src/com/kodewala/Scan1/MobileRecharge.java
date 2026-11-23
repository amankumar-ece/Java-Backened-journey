package com.kodewala.Scan1;

import java.util.Scanner;

public class MobileRecharge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer Name: ");
		String name = sc.nextLine();
		
		System.out.println("Mobile Operator: ");
		String operator = sc.nextLine();
		
		System.out.println("Recharge Amount: ");
		int amount = sc.nextInt();
		
		System.out.println();
		
		int cashback;
		
		if (operator.equals("jio")) 
		{
			cashback = 50;
		}
		else if( operator.equals("Airtel"))
		{
			cashback = 30;
		}
		else if(operator.equals("VI"))
		{
			cashback = 20;
		}
		else
		{
			cashback  = 0;
		}
		
	   int 	finalAmount = amount - cashback; 
			   
		System.out.println("Name:"+name);
		System.out.println("Amount: "+amount);
		System.out.println("Operator: "+ operator);
		System.out.println("Cashback: "+ cashback);
		System.out.println("Final Amount: "+ finalAmount);
		
		sc.close();
		
		
		
	}

}
