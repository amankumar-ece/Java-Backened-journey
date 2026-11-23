package com.kodewala.collections1;
/*
 * Collections: 
 */
public class Driver {

	public static void main(String[] args) {
		
		// store the price --> container(box) which holds integer value
		int price [] = {200, 5000,400,3000, 900}; // Memory --> Heap ---> store to DBdataBase(JDBC)
		
		// Process
		for(int index= 0; index <price.length; index++)
		{
			int currentPrice = price[index];
			
		//	System.out.println("Current price is: "+ currentPrice);
			
			if(currentPrice > 1000)
			{
				System.out.println("Current Price : "+currentPrice);
			}
		}
	}

}
