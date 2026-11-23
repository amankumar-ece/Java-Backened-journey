package com.kodewala;

public class Test {
	
  public static void main(String[] args) { // +ve --> Happy Scenario
	
	  System.out.println("This is sample program - START");
	  
	  int amount = 100;
	  String name = null; // 
	  
	  System.out.println("Amount "+ amount);
	  System.out.println("length "+ name.length()); // NullPointer Exception
	  
	  System.out.println("This is sample program - END");
	  
}
}
