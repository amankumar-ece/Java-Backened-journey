package com.kodewala.collections2;

import java.util.ArrayList;

public class ArrayListExp1 {
	
	public static void main(String[] args) {
		
		// default capacity : 10

	ArrayList<String> list = new ArrayList<String>(); // This will grow dynamically
	
	list.add("Aman");
	list.add("Abhi");
	list.add("Abhisek");
	list.add("Arjun");
	
	list.add("Banglore");
	list.add("Chennai");
	list.add("Mysore");
	list.add("Delhi");
	
	list.add("Hyderabad");
	
	System.out.println(list);
	
	}

}
