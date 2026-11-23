package com.employee.message;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialization {
	
	public void serializeMsg(Employee employee) throws IOException
	{
		FileOutputStream fio = new FileOutputStream("employee.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fio);
		
		oos.writeObject(employee); // writing
		
		oos.close();
	}
	
}
