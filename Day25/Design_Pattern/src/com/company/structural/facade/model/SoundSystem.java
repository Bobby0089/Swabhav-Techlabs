package com.company.structural.facade.model;

public class SoundSystem {

	public void turnOn()
	{
		System.out.println("Sound system are on");
	}
	
	public void setVolume(int volume)
	{
		System.out.println("Sound System volume set to  : "+ volume);
	}
	
	public void turnOf()
	{
		System.out.println("Sound system are off");
	}

}
