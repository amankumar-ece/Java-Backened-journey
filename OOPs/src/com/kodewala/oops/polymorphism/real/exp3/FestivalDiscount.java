package com.kodewala.oops.polymorphism.real.exp3;

public class FestivalDiscount extends ShoopingCartDiscount
{
	@Override
	public double calculateDiscount(double price)
	{
		return price * 20/100;
		
	}
}
