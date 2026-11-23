package com.kodewala.loops1;

public class Driver {

	public static void main(String args[]) {
		Employee employee1 = new Employee("Aman", 1800, "94521");
		Employee employee2 = new Employee("Rahul", 1000, "8521");
		Employee employee3 = new Employee("Ravi", 1500, "8526");

		Employee employee[] = new Employee[3];

		employee[0] = employee1;
		employee[1] = employee2;
		employee[2] = employee3;

		for (int index = 0; index < employee.length; index++)
			

		{
			System.out.println("Employee Name: " + employee[index].employeeName);
			System.out.println("Salary:" + employee[index].salary);
			System.out.println();
		}
	}
}
