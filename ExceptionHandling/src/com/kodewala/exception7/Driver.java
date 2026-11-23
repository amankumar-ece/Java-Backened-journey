package com.kodewala.exception7;

import java.text.NumberFormat;
/*
 * In Multi-catch
 * 1- condition: should not have parent and child. 
 *               It should be Independent
 */
public class Driver {
	public static void main(String[] args) {
		
		try {
			
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException e) // java 7 (Multi catch)
		{
			e.printStackTrace();
		}
	}

}
