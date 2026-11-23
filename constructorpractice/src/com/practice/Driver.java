package com.practice;

public class Driver {

	public static void main(String[] args)
	{
		
		// creating product with all attributes
		product product = new product("Bottle", 200 , "plastic Bottle " , 5);
		
		// creating product with product name and description
		product product1 = new product("Mobile","Electronic Gadget");
		
		// creating product without any attributes
		product product2 = new product();
		
		System.out.println("product:");
		product.showProduct();
		
		System.out.println("Product1:");
		product1.showProduct();
		
		System.out.println("product2:");
		product2.showProduct();
		
	}
}
   
		
	
		
		
		
	


