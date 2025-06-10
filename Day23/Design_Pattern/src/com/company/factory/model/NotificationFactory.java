package com.company.factory.model;

public class NotificationFactory {
	
	private static NotificationFactory instance1;
	
	private NotificationFactory() {}

	public static NotificationFactory getInstance()
	{
		if(instance1 == null)
		{
			instance1 = new NotificationFactory();
		}
		
		return instance1;
	}
	public  INotification makePayment(String input)
	{
		switch(input.toLowerCase())
		{
		case "email" : return new Email();
		
		case "sms" : return new Sms();
		
		case "push" : return new PushNotification();
		
		default : System.out.println();
				  return null;
		}
	}
}
