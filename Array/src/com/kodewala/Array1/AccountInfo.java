package com.kodewala.Array1;

public class AccountInfo {
	
	public void getCustomers()
	{
		// Get the Customer's detail whose  account balance is -ve
		
		// Created String array which will hold 5 String objects.
		String customers[]= new String[5]; // Static index = 0 to 4
		
		// Add an Element 
		customers[0]= "Rahul";
		customers[1]= "Aman";
		customers[2]= "sonu";
		customers[3]= "Ravi";
		customers[4]= "minu";
		
		// Accessing / Reading an element from array
		String element = customers[2];
		
		System.out.println();
		
		// loop 
		for(int index=0; index < customers.length; index++)
		{
			String currentElement = customers[index];
			
			if(currentElement.startsWith("s"))
			{
				System.out.println(currentElement);
			}
		}
	}
}
/*
class Driver {
	
	public static void main(String args[]) {
		
		AccountInfo accountInfo = new AccountInfo();
		accountInfo.getCustomers();
	}
}
*/