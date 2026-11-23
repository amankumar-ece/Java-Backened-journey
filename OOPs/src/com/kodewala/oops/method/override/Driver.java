package com.kodewala.oops.method.override;
/*
 *  Method Overriding --> Changing the parent class functionalities in child class
 */
class Employee extends Object // parent 
{
	// Functionalities
	public void saySomething()
	{
		System.out.println("Hello!!!");
	}
}

class Manager extends Employee // Manager is child now 
{
	public void saySomething() 
	{
      System.out.println("Hey Bro!!");
	}
}

public class Driver {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.saySomething();
		Manager mng = new Manager();
		mng.saySomething();
	
	}

}
