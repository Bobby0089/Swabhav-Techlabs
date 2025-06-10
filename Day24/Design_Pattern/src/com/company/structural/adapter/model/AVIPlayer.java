package com.company.structural.adapter.model;

public class AVIPlayer implements AdvanceMediaPlayer{

	@Override
	public void playMp4(String fileName) {
		//not supported
	}

	@Override
	public void playAVI(String fileName) {
		System.out.println("Playing Avi file : " + fileName);
	}


}
