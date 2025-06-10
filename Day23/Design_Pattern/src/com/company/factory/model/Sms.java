package com.company.factory.model;

public class Sms implements INotification{

	@Override
	public void sendNotification(String message) {
		System.out.println(message);
	}

}
