package com.kodewala.Scan1;

import java.util.Scanner;

public class LoginSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		String username = sc.nextLine();
		
		System.out.println("Enter password: ");
		String password = sc.nextLine();
		
		if (username.equals("aman") &&  password.equals("java123"))
		{
			System.out.println("Login Successful: ");
		}
		else 
		{
			System.out.println("Invalid Username OR Password ");
		}

	

		
	}

}
