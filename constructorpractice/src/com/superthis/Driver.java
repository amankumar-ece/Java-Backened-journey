package com.superthis;

class OrderMGmt {
	OrderMGmt()
	{
	super(); // calling Object class constructor
	System.out.println("OrderMgmt.OrderMgmt()");
	}
}

class order extends Object {

	public order() {
		// Either super() OR this()
		super(); // call the class no arg constructor
		System.out.println("Order.Order");
	}
}

public class Driver extends Object {

	public static void main(String args[]) {

		order ord = new order();
		System.out.println(); // call the constructor
	}

}
