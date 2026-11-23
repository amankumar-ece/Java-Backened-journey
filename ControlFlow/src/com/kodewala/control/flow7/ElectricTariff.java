package com.kodewala.control.flow7;

public class ElectricTariff {
	
/*	
	public static void main(String args[]) {
		
		ElectricTariff electricTariff = new ElectricTariff();
		int plan = Integer.parseInt(args[0]);
		electricTariff.identifyPlan(plan);

	}
*/
	public void identifyPlan(int number) {

		switch (number) {
		case 1:
			System.out.println("Basic");
			break;
		case 2:
			System.out.println("Standard");
			break;
		case 3:
			System.out.println("Premium");
			break;
		case 4:
			System.out.println("Industrial");
			break;
		case 5:
			System.out.println("Solar");
			break;

		default:
			System.out.println("unknown plan, please Enter valid number");
			break;
		}
	}
}
