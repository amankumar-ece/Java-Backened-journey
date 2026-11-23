package com.kodewala.inf3;

public class  Driver {
	
	public static void main(String[] args) {
	
	IAccount account = (name, add, amt) ->
	{
		System.out.println("opening Account...for "+name);
		 return "Account Opened ";
	};
	
	account.openAccount("Kodewala" , "BTM Banglore" , 1000);
	
	}

}
