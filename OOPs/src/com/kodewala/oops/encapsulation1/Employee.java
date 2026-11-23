package com.kodewala.oops.encapsulation1;

public class Employee {
	private String employeeName;
	private int employeeId;
	private double salary;
	
	public Employee(String employeeName, int employeeId, double salary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	
	// getter methods to read all three 
	public String getEmployeeName()
	{
		return employeeName;
	}
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	public double getSalary()
	{
		return salary;
	}
	
    public boolean increaseSalary(double amount)
    {
    	if (amount <= 0) {
    		System.out.println("Invalid Amount. Amount must be Positive");
    	return  false;
    }
    if( amount > 10000)
    {
    	System.out.println("Invalid Amount.Maximum increase is 10000.");
    	return false;
    }
    
    salary = salary + amount;
    System.out.println("Salary increased Successfully. ");
    return true;
    
    }
}
