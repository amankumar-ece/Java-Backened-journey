package com.kodewala.inf09;

public class Driver {
	
	public static void main(String[] args) {
		AdditionCalculator add = (i,j) ->i + j;
		
	    int sum = add.doCalc(50, 45);
		
		System.out.println(sum);
	}
}
