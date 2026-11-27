package com.kodewala.collectionsPractice;

import java.util.ArrayList;

public class RetrieveElement {

	public static void main(String[] args) {

		ArrayList<String> student = new ArrayList<String>();
		
		student.add("Aman");
		student.add("Sonu");
		student.add("Abhi");
		
		System.out.println("Student at Index: "+ student.get(2));
	}

}
