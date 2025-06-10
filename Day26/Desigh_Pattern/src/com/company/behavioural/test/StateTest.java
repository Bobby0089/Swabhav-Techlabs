package com.company.behavioural.test;

import com.company.behavioural.model.TrafficLight;

public class StateTest {
	
	public static void main(String[] args) {
		
		TrafficLight trafficLight = new TrafficLight();
		
		trafficLight.changeState();
		trafficLight.changeState();
		trafficLight.changeState();
		trafficLight.changeState();
		trafficLight.changeState();
	}

}
