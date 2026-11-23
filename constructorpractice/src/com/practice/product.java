package com.practice;

public class product {

	String productName;
	int price;
	String description;
	int quantity;

	// constructor 1
	product( String _productName, int _productPrice , String _description , int _quantity)
	{
		
		this.productName = _productName;
		this.price = _productPrice;
		this.description = _description;
		this.quantity = _quantity;
	 }
	
	// constructor 2
	product(String _productName, String _description) 
{
	  this.productName = productName;
	  this.description = description;
	  
}

	// constructor 3
	product()
	{
		//No values 	
	}
	
	void showProduct()
	{
		System.out.println("Product Name : " + productName);
		System.out.println("Price :" + price);
		System.out.println("Descriptiom : " +description);
		System.out.println("Quantity :" + quantity);
	}
}
