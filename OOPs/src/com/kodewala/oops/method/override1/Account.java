package com.kodewala.oops.method.override1;
/*
 * Method Overriding :
 * Changing the parent class functionalities in child class
 */
public class Account
{
	int minBalance=10000;
	public String openAccount(String name, int initBal)
	{
		//some.. 100lines of code---> x
		System.out.println("Account.openAccount()....");
		return "Some String";
		
	}

}

class savingAccount extends Account
{
	/*
	 * Rules:
	 * 1. Method name should be Same.
	 * 2. Type, Order and Number should be same except covariant.
	 * 3. Access Modifier--> should be same or widen(public--> public,protected--> protected)
	 * 
	 * 4. Overriding can happens only with instance objects Not Static
	 * 
	 * 5. A static method belongs to the class, not to an object. 
	 *    Method overriding works with instance methods and supports runtime polymorphism.
	 */
	@Override // You are telling compiler that i am overriding the method.please check all the rules.
	public String openAccount(String _name , int _initBal)
	{
		// 200 lines of the code --> x+1
		System.out.println("SavingAccount.openAccount().......");
		return "Some other string";
	}
}
