package com.kodewala.exception1;
 
public class Order {
	
	public void doSomething()
	{
		String name = null;
		
		try {
			System.out.println(name.length()); // Risky code
			System.out.println("After length.....");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		for(int i=0; i< 5; i++)
		{
			System.out.println("Driver.main()....." + i);
		}
	}

}
