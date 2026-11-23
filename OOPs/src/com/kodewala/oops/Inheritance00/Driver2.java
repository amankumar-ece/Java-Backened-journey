package com.kodewala.oops.Inheritance00;
class Notifications
{
	String countryName ="India"; // Field OR Attribute --> Data
	
	public void sendEmail(String email) // Work OR Task
	{
		System.out.println("Notification.sendEmail()");
	}
	public void sendSMS(String mobile , String text) {
		System.out.println("Notifications.sendSMS()");
	}
}

public class Driver2 {

	public static void main(String[] args) {

		Notifications notification = new Notifications();
		
		notification.sendEmail("aman@gmail.com");
		notification.sendSMS( "6202598", "Your order is shipped");
		
		System.out.println(notification.countryName);
	}

}
