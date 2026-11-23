package com.kodewala.control.flow8;

public class AtmTransaction {

	public static void main(String[] args) {

		AtmTransaction transaction = new AtmTransaction();
		int type = Integer.parseInt(args[0]);
		transaction.identifytype(type);
	}
	
	public void identifytype(int number)
	{
		switch (number) {
		case 1:
			System.out.println("Deposit");
			break;
		case 2:
			System.out.println("Withdrawal");
			break;	
		case 3:
			System.out.println("Balance Check");
			break;
		case 4:
			System.out.println("Mini Statement");
			break;
		case 5:
			System.out.println("Change PIN");
			break;
		
		default:
			System.out.println("unknown Transaction, please Enter valid Number");
			break;
		}
		
	}

}
