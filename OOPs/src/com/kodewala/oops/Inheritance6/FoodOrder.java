package com.kodewala.oops.Inheritance6;

public class FoodOrder { // parent class
	
	private String customerName;
	private int foodAmount;
	public FoodOrder(String customerName, int foodAmount) {
		super();
		this.customerName = customerName;
		this.foodAmount = foodAmount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getFoodAmount() {
		return foodAmount;
	}
	public void setFoodAmount(int foodAmount) {
		this.foodAmount = foodAmount;
	} 
	public double calculateBill() {
		return foodAmount +40;
	}
	public void displayBill() {
		System.out.println("Customer Name: " + getCustomerName());
		System.out.println("Final Bill: " + calculateBill());
	}

}
