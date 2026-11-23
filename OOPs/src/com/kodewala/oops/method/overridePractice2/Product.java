package com.kodewala.oops.method.overridePractice2;

public class Product {
	public void displayDetails()
	{
		System.out.println("Details: ");
	}

}
 class ElectronicProduct extends Product
 {
	 public void displayDetails()
	 {
		 System.out.println("Electronic Product:");
	 }
 }
 
 class MobilePhone extends ElectronicProduct
 {
	 public void displayDetails()
	 {
		 System.out.println("Mobile phone");
	 }
 }
 
 class Details
 {
	 public static void main(String[] args) {
		MobilePhone phone = new MobilePhone();
		phone.displayDetails();
	}
 }