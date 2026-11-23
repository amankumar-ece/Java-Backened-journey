package com.kodewala.exception5;

import java.io.BufferedReader;
import java.io.FileReader;

public class Driver {
	public static void main(String[] args) {
		
		// Try with resources Introduced in  Java 7 / 1.7
		try(BufferedReader br = new BufferedReader(new FileReader
				("C:\\Users\\onlin\\OneDrive\\kodewala\\25thAug2026\\ExceptionHandling\\src\\com\\kodewala\\exception5\\test.txt"));) 
		{
			String line;
			while((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
			// risky 
			// open the connection(db, file etc)
			//20 lines
			// 21st line closing the connection
		}
		catch (Exception e )
		{
			e.printStackTrace();
			// handle --> closing part 
		}
		finally
		{
			// cleanup 
		}
	}

}
