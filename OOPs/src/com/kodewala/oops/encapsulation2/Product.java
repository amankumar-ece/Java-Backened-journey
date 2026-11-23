package com.kodewala.oops.encapsulation2;

public class Product {
	private String productName;
	private int productId;
	private int quantity;
	
	public Product(String productName, int productId, int quantity) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.quantity = quantity;
	}
	
	public String getProductName()
	{
		return productName;
	}
	public int getproductId()
	{
		return productId;
	}
	public int getQuantity()
	{
		return quantity;
	}
	
	public boolean addStock(int amount)
	{
		if (amount <= 0)
		{
			System.out.println("Invalid Amount. Amount must be positive");
			return false;
		}
		if (amount > 100)
		{
			System.out.println("Invalid quantity.Maximum quantity 100.");
			return false;
		}
	
		quantity = quantity + amount;
		System.out.println(" Stock added Succesfully ");
         return true;

	}

}
