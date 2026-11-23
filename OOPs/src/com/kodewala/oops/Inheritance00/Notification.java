package com.kodewala.oops.Inheritance00;

public class Notification { // parent class 
		String countryName ="India"; // Field OR Attribute --> Data
		
		public void sendEmail(String email, String text , String attachment) // Work OR Task
		{
			System.out.println("Notification.sendEmail()");
			System.out.println("Email: "+ email);
			System.out.println("Message: "+ text);
			System.out.println("Attachment: "+ attachment);
		}
		public void sendSMS(String mobile , String text) {
			System.out.println("Notifications.sendSMS()");
			System.out.println("Mobile: "+ mobile);
			System.out.println("Message: "+ text);
		}
} 

		
