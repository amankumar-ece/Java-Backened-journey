package com.kodewala.inf08;

public class Driver {

	public static void main(String[] args) {
		
		ICalc calc =(i,j) -> i*j;
		
		int sum = calc.doCacl(12, 34);
		System.out.println(sum);
	}
}
