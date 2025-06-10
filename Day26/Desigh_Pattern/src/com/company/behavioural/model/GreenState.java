package com.company.behavioural.model;

public class GreenState implements State{

	@Override
	public void handelRequest(TrafficLight trafficLight) {
		System.out.println("Signal is green . you can go");
		
		trafficLight.setState(new YellowState());
	}

}
