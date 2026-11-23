package com.kodewala.oops.polymorphism.real.exp3;

public class ShoopingCart {
	public void printDiscount(ShoopingCartDiscount discount, double price)
	{
		double discountAmount = discount.calculateDiscount(price);
		
		System.out.println("Original price: "+ price);
		System.out.println("Discount Amount: " + discountAmount);
		System.out.println("Final price: "+(price - discountAmount));
		
		System.out.println("...........");
	}

}
