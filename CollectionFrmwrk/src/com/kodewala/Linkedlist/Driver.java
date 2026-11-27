package com.kodewala.Linkedlist;
/* Linked List: 
              1. Node based(previous - element - next)
              2. Does not use continuous memory location
Good For->     
         1. Random insertion(it just change the linking) > O(n) -> O(n) to reach
            the particular element + O(1) to insert an element.

Not Good for -> searching an element
 * 
 */
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
