package com.kodewala.oops.polymorphism2;

class Employee 
{
	public void markIn() {
		System.out.println("Employee.markIn()....Employee Marking IN");
	}
}

class HRManager extends Employee 
{
	public void markIn() {
		System.out.println("HRManager.markIn().....HRManager Marking IN");
	}
}

public class Driver {

	public static void main(String[] args) {
/*
 * Employee e1 = new Employee(); 

 */
		
		Employee e2 = new HRManager(); // parent class can refer child class object.
		
		e2.markIn(); // same method will behave differently based on the actual object.
		
		//1. At the time of compilation, it will check the method's exist in the class
		
		//2. at the time of execution(while running), it will call the method on actual object
	}

}
