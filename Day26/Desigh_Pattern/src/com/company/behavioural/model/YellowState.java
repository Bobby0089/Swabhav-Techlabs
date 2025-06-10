package com.company.behavioural.model;

public class YellowState implements State{

	@Override
	public void handelRequest(TrafficLight trafficLight) {
		System.out.println("Signal is yellow. you must slow down");
		
		trafficLight.setState(new RedState());
	}

}
