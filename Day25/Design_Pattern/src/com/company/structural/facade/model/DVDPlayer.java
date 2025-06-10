package com.company.structural.facade.model;

public class DVDPlayer {
	
	public void turnOn()
	{
		System.out.println("DVD player turning on");
	}
	
	public void playMovie(String movie)
	{
		System.out.println("playing Movie : "+movie);
	}
	
	public void turnOf()
	{
		System.out.println("DVD player turning off");
	}

}
