package com.kodewala.inf018;

public class Driver {

	public static void main(String[] args) {

		IWelcome obj = () -> "Welcome to java Developer Training";
		
		String result = obj.getMessage();
		
		System.out.println(result);
	}

}
