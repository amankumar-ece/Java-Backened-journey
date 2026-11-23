package com.kodewala.ecommerce;
import com.kodewala.ecommerce.*;
public class Driver {

	public static void main(String[] args) {

    Order o1 = new Order("42315" , "Aman" ,"Online");
    Order o2 = new Order("42315" , "Aman" ,"Online");
    Order o3 = new Order("42315" , "Aman" ,"Online");
    Order o4 = new Order("42315" , "Aman" ,"Online");
    Order o5 = new Order("42315" , "Aman" ,"Online");

    System.out.println("Total order:" + Order.OrderCount);
	}

}
