package com.student.school;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {

		StudentSerialization studentSerialization = new StudentSerialization();
		
		Student student = new Student("A123" , "Aman" , "Hellens" , 35512);
		
		studentSerialization.serializeStudent(student);
		
	}

}
