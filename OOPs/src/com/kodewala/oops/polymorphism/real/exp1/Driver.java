package com.kodewala.oops.polymorphism.real.exp1;

public class Driver {

	public static void main(String[] args) {

		NotificationProcessor processor = new NotificationProcessor();
	
		// Notification notification = new Notification();
		// processor.processNotification(notification);
		
		EmailNotification emailNotification = new EmailNotification();
		processor.processNotification(emailNotification);
		
		SMSNotification smsNotification = new SMSNotification();
		processor.processNotification(smsNotification);
		
		WhatsAppNotification whatsappNotification = new WhatsAppNotification();
		processor.processNotification(whatsappNotification);
		
	}

}
