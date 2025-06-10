package com.company.behavioural.observer.model;

public class PhoneDisplay implements Observer{

	private float temperature;

	@Override
	public void update(float temperature) {
		this.temperature = temperature;
		System.out.println("Phone Display : Temperature update to "+ temperature+"C");
	}
	
}
