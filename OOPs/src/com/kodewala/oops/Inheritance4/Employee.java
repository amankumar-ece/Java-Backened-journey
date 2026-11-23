package com.kodewala.oops.Inheritance4;

public class Employee {  // Parent class


	private	String employeeName;
	private	double basicSalary;
	
	public Employee(String employeeName, double basicSalary) {
		super();
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public double  calculateSalary() {
		return basicSalary;
	}

	public void displayDetails() {
		System.out.println("Employee Name:"+ employeeName);
		System.out.println("Salary: " + calculateSalary());
	}
}



