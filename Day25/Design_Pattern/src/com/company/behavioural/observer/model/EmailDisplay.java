package com.company.behavioural.observer.model;

public class EmailDisplay implements Observer {
	
	private float temperature;

	@Override
	public void update(float temperature) {
		this.temperature = temperature;
		System.out.println("Email Display : Temperature update to "+ temperature+"C");
	}
}
