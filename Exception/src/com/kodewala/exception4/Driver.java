package com.kodewala.exception4;
/*
 * Exceptions are always raised at the run time only(While Execution)
 * 
 * 1.checked Exception: compile time Exception 
 *                      If your compiler knows that, If code is throwing some exception, Though some exceptions are called
                        CheckedException. 
 *                      compiler knows about the Exception.
 *                      e.g. classNotFoundException , FileNotFoundException,IoException
 */
public class Driver {
	public static void main(String[] args) {
		
		String name = null;
		System.out.println(name.length()); // NullpointerException

	     String className ="com.kodewala.exception4.Driver";
	     try {
	    	 
			Class.forName(className);
			System.out.println("Class Loaded...");
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

}
