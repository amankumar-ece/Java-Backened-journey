package com.kodewala.oops.abstraction3;

public abstract class Employee {
	
	public abstract void calculateSalary(int hour);
	
}

class FullTime extends Employee
{
	public void calculateSalary(int hours)
	{
		 int salary = 30000;
		 System.out.println("Full Time Employee Salary Rs. "+ salary);
}
}
class PartTime extends Employee 
{
	public void calculateSalary(int hours)
	{
		int salary = 500 * hours;
		System.out.println("PartTime Employee salary Rs. " + salary );
	}
}