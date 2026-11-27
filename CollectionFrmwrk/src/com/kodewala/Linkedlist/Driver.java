package com.kodewala.Linkedlist;

import java.util.LinkedList;

public class Driver {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Banglore");
		list.add("chennai");
		list.add("Hyderabad");
		list.add("Mumbai");
		list.add("Delhi");
		
		System.out.println(list);
		
		list.add(2, "jaipur");
		System.out.println(list);
	}
}
