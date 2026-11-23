package com.kodewala.oops.abstraction4;

public abstract class FoodOrder {
	
	// concrete method: contains implementation
	public void displayOrderDetails()
	{
	 System.out.println("Displaying Order Details");
	}
	
	//Abstract method: child classes must implement it 
	public abstract void calculateBill();

}

class RegularOrder extends FoodOrder
{
	public void calculateBill()
	{
		System.out.println("Regular : No Discount");
	}
}

class PremiumOrder extends FoodOrder
{
	public void calculateBill()
	{
		System.out.println("Premium : 10% Discount");
	}
}

class finalBill
{
	public static void main(String[] args) {
		
		FoodOrder regular = new RegularOrder();
		FoodOrder premium = new PremiumOrder();
		
		regular.displayOrderDetails();
		premium.calculateBill();
	}
}