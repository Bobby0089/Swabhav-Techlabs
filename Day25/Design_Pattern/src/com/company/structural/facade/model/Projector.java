package com.company.structural.facade.model;

public class Projector {

	public void turnOn()
	{
		System.out.println("Turning on projector");
	}
	
	public void setInput(String source)
	{
		System.out.println("projector input set to : "+ source);
	}
	
	public void turnOf()
	{
		System.out.println("Turning off projector");
	}

}
