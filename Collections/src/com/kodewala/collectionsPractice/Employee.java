package com.kodewala.collectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
	
	public static void main(String[] args) {
		
		ArrayList <String> emp = new ArrayList<String>();
		
		emp.add("Aman");
		emp.add("Rahul");
		emp.add("Rohit");
		
		for (int i = 0; i < emp.size(); i++) {
			
			String employeeName = emp.get(i);
		}
		System.out.println("Employee Name: "+emp);
	}

}
