package com.kodewala.control.flow7;

public class Driver {

	public static void main(String[] args) {

		ElectricTariff electricTariff = new ElectricTariff();
		int plan = Integer.parseInt(args[0]);
		electricTariff.identifyPlan(plan);
	}

}
