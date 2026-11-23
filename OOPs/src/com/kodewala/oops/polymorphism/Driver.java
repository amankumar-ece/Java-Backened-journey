package com.kodewala.oops.polymorphism;
class User
{
	
}

class AdminUser extends User // AdminUser IS-A type of user
{

}

class FinanceUser extends AdminUser
{
	
}

public class Driver {
	public static void main(String[] args) {
		
		User u1 = new User(); // User class is referring User class object.
		AdminUser au1 = new AdminUser();
		
		User au2 = (User) new AdminUser(); // parent class can refer child class object --> auto up-casting 
		
		AdminUser au3 =new FinanceUser();
		
		AdminUser au = (AdminUser) new User(); //child class is referring parent class object --> down casting
	}
}