package com.kodewala.exception3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Driver {
		public static void main(String[] args) throws IOException {
			
			BufferedReader br = null;
			try {
				System.out.println("try START");
				br = new BufferedReader(new FileReader("C:\\Users\\onlin\\OneDrive\\kodewala\\25thAug2026\\ExceptionHandling\\src\\com\\kodewala\\test.txt"));
				
				String name = args[0]; // This code may throw exception..
				
				System.out.println("Driver.main()--try end...");
				
				System.exit(0); // kill the JVM 
			}
			
			catch (ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
				System.out.println("Name is not provided..");
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Some other problem...");
			}
			finally // Mandatory Executable Block
			{
				br.close(); // closing the file Connection
				System.out.println("Driver. finally block...");
			}
	  }
}
