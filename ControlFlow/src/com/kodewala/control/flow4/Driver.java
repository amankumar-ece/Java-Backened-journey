/*
 *  switch case [6-10-2026]
 */
package com.kodewala.control.flow4;

public class Driver {

	public static void main(String[] args) {

		Driver driver = new Driver();
		
		int day = Integer.parseInt(args[0]);
		
		driver.identifyDay(day);
		
	}
	
	public void identifyDay(int number) {
		switch (number) {
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Mon");
			break;
		case 3:
			System.out.println("Tue");
			break;
		case 4:
			System.out.println("wed");
			break;
		case 5:
			System.out.println("thu");
			break;

		case 6:
			System.out.println("FRI");
			break;
		case 7:
			System.out.println("SAT");
			break;

		default:
			System.out.println("unknown, please Enter valid Number!!");
			break;
		}
	}

}
