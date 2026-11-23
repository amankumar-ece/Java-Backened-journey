package com.kodewala.Scan;

import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int price=0;
		System.out.println("please enter the price..");
		// Before reading the integer , you are going to make sure that user supply an int.
		
		if(sc.hasNextInt())
		{
			price = sc.nextInt();
			
		}
		else 
		{
			System.out.println("Please Enter the price in right format");
		}
		System.out.println("Price: "+ price);
		sc.close();
	}

}
