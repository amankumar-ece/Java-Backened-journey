package com.kodewala.control.flow3;

public class Shopping {
	public static String CalculateDiscount(String customerType , int amount)
	{
		String discount = null;
		if (amount <= 10000)
		{
			discount = "No Discount";
		}
		
		else if (amount >10000 && amount <=5000)
		{
			discount = "5% Discount Applied";
		}
		else if (amount > 5000 && amount <= 10000)
		{
			discount = "10% Discount Applied";
		}
		else 
		{
			// discount = discount + (amount *5  /100);
		}
	
		return discount;
	}

}
