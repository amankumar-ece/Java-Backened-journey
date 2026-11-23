package com.kodewala.Scan1;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Name: ");
		String name = sc.nextLine();
		
		System.out.println("Salary: ");
		int salary = sc.nextInt();
		
		System.out.println("Years of Experience: ");
		int exp = sc.nextInt();
		
		System.out.println();
			
		int bonus;
		
		if(exp >= 3)
		{
			 bonus = 5000;
			
		}
		else {
		    bonus = 2000;
		}
		

		
		int finalsalary =  salary + bonus;
		
		System.out.println("Name:" + name);
		System.out.println("Salary: "+ salary);
		System.out.println("Experience: "+ exp);
	    System.out.println("Bonus: " + bonus);

	    System.out.println("Final Salary: " + finalsalary);
		
		sc.close();
	}

}
