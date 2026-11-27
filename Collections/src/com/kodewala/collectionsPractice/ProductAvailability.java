package com.kodewala.collectionsPractice;

import java.util.ArrayList;

public class ProductAvailability {
	public static void main(String[] args) {
		
		ArrayList<Integer> price = new ArrayList<Integer>();
		
		price.add(1000);
		price.add(2500);
		price.add(500);
		price.add(4000);
		price.add(1500);
		
		
	boolean result =price.contains(2500);
	if(result) {
		System.out.println("2500 is available in the list");
	}

	else {
		System.out.println("2500 is not available in the List");
	}
	}
}
