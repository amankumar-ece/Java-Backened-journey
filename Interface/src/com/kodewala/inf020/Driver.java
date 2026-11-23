package com.kodewala.inf020;
/*
 * we are introducing functional interface.
    (so that JVM  will not confuse which method to call so, only one abstract method)
    which will have only one abstract method, which will be used to implement Lambda function.
    which will be used to implement Lambda function.
    
    What was the need of functional interface?
    Simple need, because Java wanted to be in the market, and wanted to introduce Lemra Expressive.
    Lambda expression is nothing. It's a functional way of writing.
 */
public class Driver {

	public static void main(String[] args) {
		
		IFormatter format = (value) -> value.trim().toUpperCase();
		
		String result = format.formatName("aman kumar");
		
		System.out.println(result);
	}
}
