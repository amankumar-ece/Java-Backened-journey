package com.kodewala.ecommerce;

public class Order {
	String orderId;
	String customerName;
	String orderType;
	public static int OrderCount;
	public Order(String orderId, String customerName, String orderType) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderType = orderType;
	}
public static int orderCount;	
	{
		// Instance Intilization
		OrderCount = OrderCount +1; 
	}
			
}


