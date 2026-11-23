package com.kodewala.loops;

public class Driver1 {

	public static void main(String[] args) {

		Customer customer1 = new Customer(" Aman", 1000, "4152");
		Customer customer2 = new Customer("Prince", 500, "4521");
		Customer customer3 = new Customer("minu", 1500, "5241");

		Customer customers[] = new Customer[3];

		customers[0] = customer1;
		customers[1] = customer2;
		customers[2] = customer3;

		for (int index = 0; index < customers.length; index++) {

			if (customers[index].accountBalance < 2000)

			{
				System.out.println("Customer Name :" + customers[index].customerName);
				System.out.println("Account Balance : " + customers[index].accountBalance);
			}
		}
	}
}
