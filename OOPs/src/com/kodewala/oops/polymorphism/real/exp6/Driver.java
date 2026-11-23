package com.kodewala.oops.polymorphism.real.exp6;

public class Driver {

	public static void main(String[] args) {

		InterestProcessor processor = new InterestProcessor();
		
		Bank bank = new SBI();
		processor.Interestprocess(bank, 5000, 2);
		
		Bank bank1 = new HDFC();
		processor.Interestprocess(bank, 6000, 5);
		
	}

}
