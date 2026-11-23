package com.kodewala.oops.encapsulation;

public class Driver {

	public static void main(String[] args) {

		BankAccount  acc = new BankAccount("Aman" , 852963l, 5000.0);
		
		System.out.println("Account Holder: " + acc.getaccountHolderName());
		System.out.println("Account Number: " + acc.getaccountNumber());
		System.out.println("Intial Balance :"+ acc.getbalance());
		
		System.out.println();
		
		acc.withdraw(2500);
		
		System.out.println("Remaining Balance : " + acc.getbalance());
		
		System.out.println();
		
		acc.withdraw(6000);
		
		System.out.println("Remaining Balance :" + acc.getbalance());
		
	}

}
