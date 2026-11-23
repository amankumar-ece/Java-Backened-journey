package com.kodewala.oops.method.overridePractice2;

public class VehicleSpeed{
	
	public void showSpeed()
	{
		System.out.println("Speed meter Limit: ");
	}

}
 class Car extends  VehicleSpeed
 {
	 
	 public void showSpeed() 
	 {
     System.out.println("Car Speed:100");
	 }
 }

 class Bike extends VehicleSpeed
{
	 public void ShowSpeed() 
	 {
       System.out.println("Bike Speed:60");
	 }
}
 
 class Bus extends VehicleSpeed
 {
	 public void ShowSpeed()
	 {
      System.out.println("Bus Speed:50"); 
	 }
 }
 
 class showSpeed{
	 public static void main(String args[])
	 {
		 VehicleSpeed speed = new VehicleSpeed();
		 speed.showSpeed();
		 
		 Car cr = new Car();
		 cr.showSpeed();
		 
		 Bike bk = new Bike();
		 bk.ShowSpeed();
		 
		 Bus bus = new Bus();
		 bus.ShowSpeed();
	 }
 }