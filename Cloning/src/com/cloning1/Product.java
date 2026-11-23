package com.cloning1;

public class Product implements Cloneable{
	
	String productName;
	String productId;
	Category category;
	public Product(String productName, String productId, Category category) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.category = category;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	

}
