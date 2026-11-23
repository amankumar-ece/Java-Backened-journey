package com.kodewala.oops.polymorphism.rev;

class Delivery {
	
	public void dodeliver()
	{
		System.out.println("Dodeliver.....()");
	}

}

class ExpressBee extends Delivery
{
	public void dodeliver()
	{
		System.out.println("ExpreeBee.....Deliver");
	}
}

class Ekart extends Delivery
{
	public void dodeliver()
	{
		System.out.println("Ekart....Deliver");
	}
}

public class Driver
{
	public static void main(String[] args) {
		
		// Delivery = new Delivery ();
		
		// compile time: it wil check the method in delivery class 
		// Runtime: it will call the method of Delivery Class 
		
		// delivery.doDeliver(); 
		
		
		// parent class can refer child class Object
		
		Delivery delivery1 = (Delivery) new ExpressBee();
		//compile time: it wil check the method in delivery class 
		// Runtime: it will call the method of Delivery Class 
		delivery1.dodeliver();
		
		// Downcasting
		Delivery del = new ExpressBee();
		ExpressBee expressBee = (ExpressBee) del;
		expressBee.dodeliver();
	}
}