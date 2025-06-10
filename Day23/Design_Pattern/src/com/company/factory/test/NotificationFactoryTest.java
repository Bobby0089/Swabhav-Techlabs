package com.company.factory.test;

import com.company.factory.model.INotification;
import com.company.factory.model.NotificationFactory;

public class NotificationFactoryTest {

	public static void main(String[] args) {
		
		NotificationFactory notification = NotificationFactory.getInstance();
		
		INotification notification1 = notification.makePayment("email");
		INotification notification2 = notification.makePayment("sms");
		INotification notification3 = notification.makePayment("push");
		
		notification1.sendNotification("hii");
		notification2.sendNotification("hii");
		notification3.sendNotification("hii");
		
		NotificationFactory notificationtest = NotificationFactory.getInstance();
		System.out.println(notification == notificationtest);
		

	}

}
