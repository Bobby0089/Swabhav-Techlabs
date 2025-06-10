package com.company.structural.facade.model;

public class HomeTheaterFacade {

	private DVDPlayer dvdPlayer;
	private Light light;
	private Projector projector;
	private SoundSystem sound;
	
	public HomeTheaterFacade(DVDPlayer dvdPlayer, Light light, Projector projector, SoundSystem sound) {
		this.dvdPlayer = dvdPlayer;
		this.light = light;
		this.projector = projector;
		this.sound = sound;
	}
	
	public void watchMovie(String movie)
	{
		System.out.println(movie+" Movie is about to start");
		light.dimLight();
		dvdPlayer.turnOn();
		projector.turnOn();
		sound.turnOn();
		sound.setVolume(10);
		dvdPlayer.playMovie(movie);
		System.out.println(movie + " Movie started");
		
	}
	
	public void endMovie()
	{
		System.out.println("Movie ended");
		dvdPlayer.turnOf();
		projector.turnOf();
		light.turnOnLight();
		sound.turnOf();
		System.out.println("Go to sleep");
	}
	
	
}
