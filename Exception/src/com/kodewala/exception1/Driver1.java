package com.kodewala.exception1;

public class Driver1 {
 
	public static void main(String[] args) {
		 ATM atm = new ATM();
		 String accountNo = "SBI6202";
		 int balance = 10000;
		 atm.dowithdrawMoney(accountNo, balance);

	}

}
class ATM

{
	void dowithdrawMoney(String accountNumber, int balance )
	{
		System.out.println("ATM.dowithdrawMoney() START");
		System.out.println("ATM.dowithdrawMoney() END");
	}
	public void validateWithdrawal(String accountNumber, int balance)
	{
		System.out.println("ATM.validate()...START");
		
		try {
			
			
			System.out.println("Account Number: "+ accountNumber);
			System.out.println("Balance: "+ balance);
			
			System.out.println(accountNumber.length()); // Risky Code
			
			int amount = Integer.parseInt("5000");
			
			int result = balance/0; //Risky code
			
			System.out.println("Withdrawal validation completed");
			
		}
		catch (NullPointerException e) {
			System.out.println("Account number is null ");
			e.printStackTrace();
			
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("Invalid account number index");
			
		}
		catch (NumberFormatException e)
		{
			System.out.println("Invalid withdrawal amount");
			e.printStackTrace();
			
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
		System.out.println("ATM.validateWithdrawal() END");
	}	
}