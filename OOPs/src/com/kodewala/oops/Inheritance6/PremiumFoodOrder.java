package com.kodewala.oops.Inheritance6;

public class PremiumFoodOrder extends FoodOrder{

	private double discount;

	public PremiumFoodOrder(String customerName, int foodAmount, double discount) {
		super(customerName, foodAmount);
		this.discount = discount;
	}
	@Override
	public double calculateBill() {
		return super.calculateBill()- discount;
	} 
}
