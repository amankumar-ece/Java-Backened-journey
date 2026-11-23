package com.kodewala.Scan1;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter your Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter Account Number:");
		
		int number = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Account Balance:");
		
		int balance = sc.nextInt();
		
		System.out.println("Withdrawal Amount:");
		
		int amount = sc.nextInt();
		
		System.out.println("Name:"+ name);
		System.out.println("Account Number :"+ amount);
		System.out.println("Account Balance:"+ balance);
		System.out.println("Withdrawal Amount:"+ amount);
        sc.nextLine();
		
		sc.close();
		
		
	}

}
