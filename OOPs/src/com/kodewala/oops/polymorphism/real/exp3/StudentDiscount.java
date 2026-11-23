package com.kodewala.oops.polymorphism.real.exp3;

public class StudentDiscount extends ShoopingCartDiscount
{
	public double calculateDiscount(double price)
	{
		return price*15/100;
	}
	

}
