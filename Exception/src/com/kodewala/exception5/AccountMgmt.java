package com.kodewala.exception5;

public class AccountMgmt {

	void openAccount(String name , String address) 
	{
	
		System.out.println("AccountMgmt.openAccount() START");
		
		activateAccount("6202");
		
		System.out.println("AccountMgmt.openAccount() END");
	
	}
	
	private void activateAccount(String accNo)
	{
		System.out.println("AccountMgmt.activateAccount() START");
		try {
		checkAccountStatus(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		System.out.println("AccountMgmt.activateAccount() END");
}
		
	private  boolean checkAccountStatus(String accNo ) throws Exception
	{
		
		try {
			accNo.startsWith("SBI"); // NPE --> Risky code
		} catch (Exception e) {
			 
			// Handle it or Throw 
			// throw --> Create new Exception object and throw it to the caller.
			throw new NullPointerException("something is null"); // checked --> Must be handled at the time of compilation.
			
		} 
		return false;
		
		
	}
}
