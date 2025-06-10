package com.company.behavioural.model;

public class YellowBlinkState implements State{

	@Override
	public void handelRequest(TrafficLight trafficLight) {
		System.out.println("Signal is yello and blinking, watch and go");
		
	}
	

}
