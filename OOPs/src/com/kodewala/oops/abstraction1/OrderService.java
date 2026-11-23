package com.kodewala.oops.abstraction1;

public class OrderService {

	public void placeOrder(String itemName, int quantity) {
		
		if(quantity <= 0) {
			System.out.println("Invalid quantity");
			return;
		}
		System.out.println("Order placement started...");
		
		checkInventory(itemName,quantity);
		processPayment(quantity*100);
		confirmOrder(itemName, quantity);
		
	}
	// core functionality
	private void checkInventory(String itemName, int quantity) {
        System.out.println("Checking stock for: " + itemName);
        System.out.println("Available quantity is sufficient.");
}
	  private void processPayment(int amount) {
	        System.out.println("Processing payment: Rs." + amount);
	    }
	  private void confirmOrder(String itemName, int quantity) {
	        System.out.println("Order confirmed!");
	        System.out.println("Item: " + itemName);
	        System.out.println("Quantity: " + quantity);
	    }
	}

