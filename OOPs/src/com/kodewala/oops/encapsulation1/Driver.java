package com.kodewala.oops.encapsulation1;

public class Driver {

	public static void main(String[] args) {

		Employee emp = new Employee("Aman" , 101 , 25000.0);
		
		System.out.println("Employee Name: "+ emp.getEmployeeName());
		System.out.println("Employee Id: "+ emp.getEmployeeId());
		System.out.println("Current Salary: "+ emp.getSalary());
		
		System.out.println();
		
		emp.increaseSalary(5000);
		System.out.println("Updated Salary: "+ emp.getSalary());
		
		System.out.println();
		
		emp.increaseSalary(15000);
		
		System.out.println("Final Salary: "+ emp.getSalary());
	}

}
