package com.company.behavioural.model;

public class RedState implements State{

	@Override
	public void handelRequest(TrafficLight trafficLight) {
		System.out.println("Signal is red . Vehicle must stop");
		
		trafficLight.setState(new GreenState());
		
	}

}
