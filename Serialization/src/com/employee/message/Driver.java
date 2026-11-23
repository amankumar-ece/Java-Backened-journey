package com.employee.message;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {

		EmployeeSerialization employeeSerialization = new EmployeeSerialization();
		
		Employee employee = new Employee("EMP1" , "Aman" , "ECE" , 200000);
		
		employeeSerialization.serializeMsg(employee);
	
		
	}

}
