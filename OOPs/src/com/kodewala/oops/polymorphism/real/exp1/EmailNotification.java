package com.kodewala.oops.polymorphism.real.exp1;

class EmailNotification extends Notification 
{
	@Override
	public void sendNotification()
	{
		System.out.println("EmailNotification.SendNotification");
	}

}
