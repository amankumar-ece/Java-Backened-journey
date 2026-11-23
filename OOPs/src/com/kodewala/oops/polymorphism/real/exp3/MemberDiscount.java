package com.kodewala.oops.polymorphism.real.exp3;

public class MemberDiscount extends ShoopingCartDiscount
{

	public double calculateDiscount(double price)
	{
		return price * 10/100;
	}
}
