package com.kodewala.constructor2;

public class NotificationService 
{
	public void sendNotification(String _type)
	{
		System.out.println("NotificationService.sendNotification()");
		
		if(_type.equalsIgnoreCase("sms")) 
		{
			sendSMS();
			
		}else if (_type.equalsIgnoreCase("email"))
		{
			sendEmail();
		}else {
			sendwhatsApp();
		
		}
	
	}
    
	private void sendSMS()
	{
		System.out.println("NotificationService.sendSMS() START");	
	}
	
	private void sendEmail()
	{
		System.out.println("NotificationService.sendEmail() End");
		
		// biz logic
	}
	
	private void sendwhatsApp()
	{
	 System.out.println("NotificationService.sendwhatsapp() END"); 
	}
}
