package com.kodewala.Scan;

import java.util.Scanner;

public class Driver {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in); // Creates connection with console

		System.out.println(" Please enter the name : ");
		String name = sc.nextLine(); // Reading String input

		System.out.println("pls enter product price...");

		int price = sc.nextInt(); // reading int --> This will leave new line char \n

		sc.nextLine(); // consume the extra char

		System.out.println("Pls enter delivery Address...");

		String address = sc.next(); // consume the single char

		System.out.println("Name is :" + name);
		System.out.println("price is :" + price);
		System.out.println("Address is :" + address);

		sc.close(); // close the connection
	}
}
