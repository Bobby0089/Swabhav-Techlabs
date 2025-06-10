package com.company.behavioural.observer.model;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
	
	private List<Observer> observers;
	private float temperature;
	
	

	public WeatherStation()
	{
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyObserver() {
		for(Observer ob : observers)
		{
			ob.update(temperature);
		}
		
	}

	public void setTemperature(float i) {
		this.temperature = i;
		System.out.println("\nWeatherStation new temperature is: "+ temperature);
		notifyObserver();
		
	}

}
