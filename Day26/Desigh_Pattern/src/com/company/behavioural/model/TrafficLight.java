package com.company.behavioural.model;

public class TrafficLight {

	private State state;
	
	public TrafficLight()
	{
		state = new GreenState();
	}
	
	public void setState(State state)
	{
		this.state = state;
	}
	
	public void changeState()
	{
		state.handelRequest(this);
	}
}
