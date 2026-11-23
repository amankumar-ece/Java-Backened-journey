package com.employee.message;

import java.io.Serializable;

public class Employee implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String employeeId;
	String employeeName;
	String department;
	int salary;
	public Employee(String employeeId, String employeeName, String department, int salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
