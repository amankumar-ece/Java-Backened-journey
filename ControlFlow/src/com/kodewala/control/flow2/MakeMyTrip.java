package com.kodewala.control.flow2;
 
public class MakeMyTrip {
	
	public static String makeMyTrip(String dest , int fare )
	{
		String discount = null;
		if(fare <= 5000)
		{
			discount = "No Discount Applied";
			//System.out.println(discount);
		}
		else if (fare > 5000 && fare <= 10000)
		{
			discount = "10% of Total fare as a Discount";
			//System.out.println(discount);
			
		}
		else if (fare >10000)
		{
			discount = "15% of Discount Applied";
			//System.out.println(discount);
		}
		else
		{
			discount = "Max Discount per costumer is 1250 Only";
		}
		
		return discount;
	}
	
}
