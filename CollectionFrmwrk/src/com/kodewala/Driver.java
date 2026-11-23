package com.kodewala;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		// Task --> Create an array list and store the Elements
		
		ArrayList<String> studentList =new ArrayList<String>(); // Create an object of ArrayList and Store String object
		
		studentList.add("chaitanya"); // Added String Object to the List
		studentList.add("Aman");
		studentList.add("aman");
		studentList.add("Rahul");
		studentList.add("ram");
		studentList.add("Sonu"); // Total 4 string Objects
		
	//	System.out.println(studentList.get(3));
		// Index Based -->
		// Apply some operation .... find the name starts with 
		
		for(int i=0; i<studentList.size(); i++)
		{
			String currentElement = studentList.get(i);
			if(currentElement.toUpperCase().startsWith("R"))
			{
				System.out.println(currentElement);
			}
		}
	}

}
