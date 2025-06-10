package com.company.behavioural.observer.model;

public class LEDDisplay implements Observer{

	private float temprature;
	
	@Override
	public void update(float temperature) {
		this.temprature = temperature;
		System.out.println("LEDDisplay : Temperature update to "+ temperature+"C");
	}

}
