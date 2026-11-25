package com.kodewala.collectionsPractice;

import java.util.ArrayList;

public class DynamicInsertion {
	public static void main(String[] args) {
		
		ArrayList<String> brand = new ArrayList<String>();
		
		brand.add("Samsung");
		brand.add("Apple");
		brand.add("OnePlus");
		brand.add("Vivo");
		brand.add("Oppo");
		
		brand.add("Realme");
		
		for (int i = 0; i < brand.size(); i++) {
			
			String currentBrand = brand.get(i);
			
		System.out.println(currentBrand);
			
		}
		System.out.println("Total Brands: " + brand.size());
	}

}
