package com.kodewala.exception7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Driver {
	public static void main(String[] args) {
		String fileName = "text.xls";
		
		try( FileOutputStream fis = new FileOutputStream(new File(fileName)) )
		{
			String name = "dsg";
			name.charAt(0); //NullPointerException
			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

}
