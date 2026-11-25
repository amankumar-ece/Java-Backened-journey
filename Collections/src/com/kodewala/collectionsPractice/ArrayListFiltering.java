package com.kodewala.collectionsPractice;

import java.util.ArrayList;

public class ArrayListFiltering {

	public static void main(String[] args) {

		ArrayList<Integer> p = new ArrayList<Integer>();
		
		int product [] = {1000, 2500, 500,4000,1500};
		
		for (int i = 0; i < product.length; i++) {
			
			int currentPrice = product[i];
			
			if(currentPrice > 2000)
			{
				System.out.println("product price: " + currentPrice);
			}
		}
	}

}
