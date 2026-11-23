package com.kodewala.oops.encapsulation2;

public class Driver {

	public static void main(String[] args) {

		Product product = new Product("Keyboard" , 101 , 20);
		
		System.out.println("Product Name: "+product.getProductName());
		System.out.println("productId: "+ product.getproductId());
		System.out.println("quantity: "+ product.getQuantity() );
		
		System.out.println();
		
		product.addStock(12);
		System.out.println("Stock added Sucessfully."+ product.getQuantity());
	}

}
