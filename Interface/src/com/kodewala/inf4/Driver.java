package com.kodewala.inf4;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {

		Account acc = new Account("Kodewala Academy", "BTM Banglore", "6254585");

		/*
		  * Account cloneObjOfAacc = (Account) acc.clone(); // trying to clone (Xerox / copy)
		  * System.out.println(cloneObjOfAacc.accNo);
	    */

		if (acc instanceof Cloneable) {
			System.out.println(" true...allowed to perform the activity....");
		} else {
			System.out.println("False");
		}
	}

}
