package com.kodewala.collectionsPractice;

import java.util.ArrayList;

public class UpdateElement {
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(70);
		num.add(80);
		num.add(65);
		num.add(90);
		num.add(75);
		
		num.set(1,95);
		
		System.out.println(num);
	}

}
