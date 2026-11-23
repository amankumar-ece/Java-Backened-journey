package com.kodewala.inf5;
/*
 * MARKER Interface: 
 * 
 */
public class DataCleaner {

public  void clean(Object obj) // Object obj = new User() upcasting
{
	if(obj instanceof Cleanable )
	{
		System.out.println("Allowed to perform the data cleaning");
	}
	else
	{
		System.out.println("Not allowed to perform the cleaning activity");
	}
 }

}
