package com.kodewala.oops.abstraction1;

public class Driver {

	public static void main(String[] args) {

		OrderService order = new OrderService() {};

        order.placeOrder("Burger", 2);

		
	}

}
