package com.kodewala.collections1;

import java.util.ArrayList;

public class ArrayListExp1 {

	public static void main(String[] args) {

		// Create a container which will hold Something (Objects)
		
		ArrayList<String> learners = new ArrayList<String>();
		
		// Storing the data 
		learners.add("Aman");
		learners.add("prince");
		learners.add("Aman");
		learners.add(null);
		learners.add(null);
		// read the data from container / arrayList
		
		System.out.println(learners);
	}

}
