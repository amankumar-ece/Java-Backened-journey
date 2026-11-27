package com.kodewala.collectionsPractice;

import java.util.ArrayList;

public class FindHighLow {
	public static void main(String[] args) {

		ArrayList<Integer> price = new ArrayList<Integer>();

		price.add(1500);
		price.add(4500);
		price.add(8000);
		price.add(6000);
		price.add(800);

		int highest = price.get(0);
		int lowest = price.get(0);
		for (int i = 0; i < price.size(); i++) {

			int currentPrice = price.get(i);

			// for Highest price
			if (currentPrice > highest) {
				highest = currentPrice;
			}

			// for lowest
			if (currentPrice < lowest) {
				lowest = currentPrice;
			}
		}
		System.out.println("Highest Price: " + highest);

		System.out.println("Lowest Price: " + lowest);
	}
}
