package com.kodewala.oops.polymorphism.real.exp6;

public class SBI extends Bank
{
	
	public double calculateInterest(double principal, int years)
	{
		return principal*5/100;
	}
}
