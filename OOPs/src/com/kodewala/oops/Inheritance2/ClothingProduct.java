package com.kodewala.oops.Inheritance2;

public class ClothingProduct extends ElectronicProduct{

	boolean isThread;
	int colourWaranty;
	
	public ClothingProduct(String productName, String description, int quantity, String status, boolean isWarranty,
			int warrantyInYears, boolean isThread, int colourWaranty) {
		super(productName, description, quantity, status, isWarranty, warrantyInYears);
		this.isThread = isThread;
		this.colourWaranty = colourWaranty;
	}


	public void viewClothingProductDetails()
	{
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		
		System.out.println(isThread);
		System.out.println(colourWaranty);
	}
	
	
}
