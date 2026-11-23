package com.kodewala.oops.encapsulation3;

public class ShoopingCart {
	
	private String CustomerName;
	private String itemName;
	private int quantity;
	private double PriceperItem;
	
	// creating constructor
	public ShoopingCart(String customerName, String itemName, int quantity, double priceperItem) {
		super();
		CustomerName = customerName;
		this.itemName = itemName;
		this.quantity = quantity;
		PriceperItem = priceperItem;
	}
	
//  create Getter methods to read all 
	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPriceperItem() {
		return PriceperItem;
	}

	public void setPriceperItem(double priceperItem) {
		PriceperItem = priceperItem;
	}
	
	// Adding valid condition
	public boolean addItem(int quantity)
	{
		if (quantity <= 0) {
			System.out.println("Quantity must be greater than Zero");
			return false;
		}
			this.quantity += quantity;
			System.out.println("Items Added Successfully");
			return true;
		}
		
	public boolean removeItem(int quantity)
		{
			if(quantity <= 0) 
			{
				System.out.println("Qantity must be greater than Zero");
			    return false;
		    }
	        if(quantity > this.quantity) 
	        {
			    System.out.println("cannot  removed more item than available.");
			    return false;
			 }
		
	        this.quantity -= quantity;
	         System.out.println("Items removed successfully");
	         return true;
		}
	
		//total calculation
		public double calculateTotal() {
			return quantity * PriceperItem;
		}
		// Display Details 
		public void displayCartDetails() {
		System.out.println("Customer Name: " + CustomerName);
		System.out.println("Item Name: " + itemName);
		System.out.println("quantity: " + quantity);
		System.out.println("Price per Item: " + PriceperItem);
		
		System.out.println("Total Amount: " + calculateTotal());
	}
	
}
