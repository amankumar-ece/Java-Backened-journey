package com.kodewala.oops.Inheritance4;

public class OnlineOrder {
	
	public static void main(String args[]) {
		System.out.println("Packing  Order");

	}
}
class Order extends OnlineOrder{
	public void placeOrder() {
		System.out.println("Order placed sucessfully");
	}
}
//Multilevel

class ExpressOrder extends OnlineOrder{
	public void fastDelivery() {
		System.out.println("Express Delivery within 24 hrs");
	}
}

//  HIERARCHICAL


