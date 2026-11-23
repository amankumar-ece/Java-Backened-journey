package com.student.school;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("C:\\Users\\onlin\\OneDrive\\kodewala\\25thAug2026\\Serialization\\student.ser");
		ObjectInputStream oos = new ObjectInputStream(fis);
		
		Student student = (Student) oos.readObject();
		
		System.out.println("De ser: "+ student.studentId);
		System.out.println(student.studentName);
		System.out.println(student.schoolName);
		System.out.println(student.getPassword());
	}

}
