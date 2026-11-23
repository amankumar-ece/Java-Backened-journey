package com.kodewala.control.flow4;

public class MonthFinder {

	public static void main(String[] args) {
		
/*
 * ClassName objectName = new ClassName();

     int input = Integer.parseInt(args[0]);

    objectName.methodName(input);		
 */
		
		MonthFinder monthFinder = new MonthFinder();
		
		int month = Integer.parseInt(args[0]);
		
		monthFinder.identifyMonth(month);

	}
	
	public void identifyMonth(int number) {
		switch (number) {
		case 1:
			System.out.println("jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("jun");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sep");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
														
		default:
			System.out.println("Unlnown Input , please Enter valid Input");
			break;
		}
	}

}
