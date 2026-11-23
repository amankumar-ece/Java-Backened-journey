package com.employee.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("C:\\Users\\onlin\\OneDrive\\kodewala\\25thAug2026\\Serialization\\employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee employee = (Employee) ois.readObject(); // downcasting 
		
		System.out.println("De ser: "+employee.employeeName);
		System.out.println(employee.employeeId);
		System.out.println(employee.department);
		System.out.println(employee.getSalary());
	}

}
