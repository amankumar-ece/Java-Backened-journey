package com.kodewala.oops.overloading2;

public class Employee {
	public void salary(String salary) 
	{
		System.out.println("Base Salary");
	}
    
	public void salary(String salary, int bonus) 
	{
		System.out.println("Base salary + Bonus");
	}
	
	public void salary(String salary, int bonus , String inctax)
	{
		System.out.println("Base salary + Bonus + incentives");
	}
}
 
class CalculateSalary
{
	public static void main(String[] args) {
		{
			Employee emp = new Employee();
			emp.salary("3000", 500);
			
			
			
		}
	}
}
