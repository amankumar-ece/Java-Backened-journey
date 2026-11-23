package com.student.school;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerialization {

	public void serializeStudent(Student student) throws IOException {

		FileOutputStream fos = new FileOutputStream("student.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		 
		oos.writeObject(student);
		System.out.println("Student serialized successfully!!!");
		oos.close();

	}
}