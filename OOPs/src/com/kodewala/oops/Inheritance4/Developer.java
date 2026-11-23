package com.kodewala.oops.Inheritance4;

public class Developer extends Employee {

	private double bonus;

	public Developer(String employeeName, double basicSalary, double bonus) {
		super(employeeName, basicSalary);
		this.bonus = bonus;

	}
	@Override
	public double calculateSalary()
	{
		
		return getBasicSalary()+ bonus;
	}

}