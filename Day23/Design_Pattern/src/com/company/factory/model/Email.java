package com.company.factory.model;

public class Email implements INotification{

	@Override
	public void sendNotification(String message) {
		System.out.println(message);
	}

}
