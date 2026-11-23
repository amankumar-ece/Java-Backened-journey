package com.kodewala.oops1;

public class Driver {

	public static void main(String[] args) {

		Account account = new Account();
		
		// account.balance = 100000;
		
		account.setBalance(-100000);
		System.out.println(account.getBalance());
	}

}
