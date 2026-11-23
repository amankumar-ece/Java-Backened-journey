package com.kodewala.Scan1;

import java.util.Scanner;

public class EventEntry {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name:");
		String name = sc.nextLine();
		
		System.out.println("Age:");
		int  age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Id Type:");
		String type = sc.nextLine();
		
		if (age >= 18 && (type.equals("CollegeID") || type.equals("CompanyID")))
			
		
		{
			System.out.println("Entry Allowed");
			System.out.println("Welcome" + name);
			
		}
		else {
			System.out.println("Entry Denied");			
		}
		sc.close();
	}
    
}
