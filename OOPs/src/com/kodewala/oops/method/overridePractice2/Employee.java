package com.kodewala.oops.method.overridePractice2;

public class Employee {
	public void calculateSalary()
	{
		System.out.println("Package");
	}

}

class FullTimeEmployee extends Employee
{
	public void calculateSalary()
	{
		System.out.println("FTE:30000");
	}
}

class partTimeEmployee extends Employee
{
	public void calculateSalary()
	{
		System.out.println("PTE:15000");
	}
}

class SalaryCalculation
{
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.calculateSalary();
		
		FullTimeEmployee FTE = new FullTimeEmployee();
		FTE.calculateSalary();
		
		partTimeEmployee PTE = new partTimeEmployee();
		PTE.calculateSalary();
	}
}
