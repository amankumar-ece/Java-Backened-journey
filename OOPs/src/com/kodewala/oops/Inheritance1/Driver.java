package com.kodewala.oops.Inheritance1;

import com.kodewala.oops.Inheritance.SavingAccount;

class Employee
{
	String name = "Amit";
	String address = "Banglore";
	
	private String empcode="IC1234";
	public void markIn(String empId)
	{
		System.out.println("Marking IN" + empId);
	}
}
class Manager extends Employee // Manager IS-A Employee
{
	public void doSomething()
	{
		System.out.println(name); // using the parent class attributes
		System.out.println(address);
		// System.out.println(empCode);
		markIn(address); // Using the parent class method
	}
}

public class Driver {

	public static void main(String[] args) {

		Manager manager = new Manager();
		
		manager.doSomething();
				
	}

}



