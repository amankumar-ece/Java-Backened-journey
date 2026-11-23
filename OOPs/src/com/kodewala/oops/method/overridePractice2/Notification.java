package com.kodewala.oops.method.overridePractice2;

public class Notification {
	public void sendNotification()
	{
		System.out.println("Send Notification:");
	}

}

class EmailNotification extends Notification
{
	public void sendNotification()
	{
		System.out.println("Email Notification: from Email");
	}
}

class SMSNotification extends Notification
{
	public void sendNotification()
	{
		System.out.println("SMS Notification: From SMS");
	}
}

class pushNotification extends Notification
{
	public void sendNotification()
	{
		System.out.println("Push Notification: Hiii");
	}
}

class GetNotify
{
	public static void main(String[] args) {
		
		Notification notify = new Notification();
		notify.sendNotification();
		
		EmailNotification email = new EmailNotification();
		email.sendNotification();
		
		SMSNotification sms = new SMSNotification();
		sms.sendNotification();
		
		pushNotification push = new pushNotification();
		push.sendNotification();		
	}
}