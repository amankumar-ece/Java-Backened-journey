package com.kodewala.collectionsPractice;

import java.util.ArrayList;

public class Enhancedforloop {
	public static void main(String[] args) {

		ArrayList<String> emp = new ArrayList<String>();

		emp.add("Aman");
		emp.add("Rahul");
		emp.add("priya");
		emp.add("sonu");

		// Enhanced For loop
		for (String currentEmployee : emp) {

			System.out.println(currentEmployee);
		}

	}

}
