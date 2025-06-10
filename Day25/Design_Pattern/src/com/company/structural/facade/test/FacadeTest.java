package com.company.structural.facade.test;

import com.company.structural.facade.model.DVDPlayer;
import com.company.structural.facade.model.HomeTheaterFacade;
import com.company.structural.facade.model.Light;
import com.company.structural.facade.model.Projector;
import com.company.structural.facade.model.SoundSystem;

public class FacadeTest {

	public static void main(String[] args) {
		DVDPlayer dvdplayer = new DVDPlayer();
		Projector projector = new Projector();
		SoundSystem sound  = new SoundSystem();
		Light lights = new Light();
		
		HomeTheaterFacade homeThester = new HomeTheaterFacade(dvdplayer, lights, projector, sound);
		
		homeThester.watchMovie("Dhol");
		
		homeThester.endMovie();
	}

}
