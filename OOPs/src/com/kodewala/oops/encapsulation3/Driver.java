package com.kodewala.oops.encapsulation3;

public class Driver {

	public static void main(String[] args) {

		ShoopingCart shooping = new ShoopingCart("Aman" ,"Iphone", 1 , 50000);
		System.out.println("Customer Name: " +shooping.getCustomerName());
		System.out.println("Item Name: " +shooping.getItemName());
		System.out.println("quantity: "+ shooping.getQuantity());
		System.out.println("Price: " + shooping.getPriceperItem());
		
		
		
		
	}

}
