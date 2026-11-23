package com.kodewala.oops.polymorphism.real.exp6;

public class InterestProcessor {
	
	public void Interestprocess(Bank  bank, double principal, int years)
	{
		double interest = bank.calculateInterest(principal, years);
		
		System.out.println("Principal: " + principal);
		System.out.println("Years: "+ years);
		System.out.println("Interest: "+ interest);
		
		System.out.println(".........");
	}
	
	

}
