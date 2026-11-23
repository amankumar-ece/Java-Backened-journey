package com.kodewala.inf04;
/*
 * Functional Interface: Single Abstract Method 
 *                       Other methods many But only One abstract Method 
 */
@FunctionalInterface
public interface MyInterface { // SAM --> Single abstract Method 
	
	public abstract String doSomething();

	public default void doNothing()
	{
		
	}
}
