package com.kodewala.exception;

public class Driver1 {

	public static void main(String[] args) {

		Driver1 d = new Driver1();
		d.doSomething();
	}
	
	public void doSomething()
	{
		System.out.println("Driver1.doSomething()......START");
		String name = null;
	    int amount = 100;
		try {
			
			//Risky code --> code which may throw an Exception.
		// 	amount = amount/0;
			System.out.println(name.length());
			System.out.println("After length()");
			amount = amount/0;
		}
		/*
		 * catch: Catch Block will never be Empty.
		 */
		catch(NullPointerException e) // This can catch Exception's object and its child objects
		{
			System.out.println("Name is Null...");
			e.printStackTrace();
		}
		catch(ArithmeticException e) //This can catch Exception's object and its child objects
		{
			System.out.println("Amount can not be / by Zero");
			e.printStackTrace();
		}
		System.out.println("Driver1.doSomething()...END");
	}

}
