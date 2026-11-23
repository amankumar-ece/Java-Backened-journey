class Payment
{
	int totalBalance = 2000; // Instance variable --> belongs to object 
	
	static int maxAmount = 1000; // Static variable --> belongs to class 
	
	public static void main(String args[])
	{
		// Created variables
		
		int balance =200; // Local variable 
		
		int amountToBeTxn=10; // Local variable 
		
		System.out.println("Balance is: " + balance);
		System.out.println("Transaction Amount: " + amountToBeTxn);
	}
	
	 public void doSomething()
	 {
		 System.out.println("Mac Amount is :"+ maxAmount); 
		 
		// using Static variable (This is static so it is declare outside the method)
	 }
}

// Practice session 

class Mobile 
{
	int price = 20000; // Instance variable
	
	static String brand = "POCO";
	
	public static void main(String args[])
	{
		Mobile rpp = new Mobile(); // object Creation
		
		System.out.println("Price : " + rpp.price); // object 
		System.out.println("Brand Name: "+ Mobile.brand); // static
		
		rpp.showPrice();
		
		Mobile.showBrand();
		
	}
	
	public void showPrice()
	{
		System.out.println("This is non-static Method ");
	}
	
	public static void showBrand()
	{
		System.out.println("This is static method");
	}
		
}

		