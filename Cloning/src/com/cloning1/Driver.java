package com.cloning1;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {

		
		// creating a category object in the heap 
		Category category = new Category("Electronics","Banglore" );
		
	
		Product product1 = new Product("Laptop","LP101" , category);
		
		Product cloneProduct =(Product) product1.clone();
		
		product1.productName = "Mobile";
		
	
		product1.category.categoryLocation = "Banglore";
		
		
		System.out.println(product1.productName);
		System.out.println(cloneProduct.productName);
		System.out.println(product1.category.categoryLocation);
		System.out.println(cloneProduct.category.categoryLocation);
		
	}

}
