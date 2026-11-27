package com.kodewala.collectionsPractice;

import java.util.ArrayList;

public class EmployeePayroll {

	public static void main(String[] args) {
		
		ArrayList<Integer> salary = new ArrayList<Integer>();
		
		salary.add(25000);
		salary.add(30000);
		salary.add(35000);
		salary.add(40000);
		
		int totalSalary = 0;
		for (int i = 0; i < salary.size(); i++) {
			
			totalSalary = totalSalary + salary.get(i);
		}
		
		System.out.println("Total salary : "+ totalSalary);
	}
}
