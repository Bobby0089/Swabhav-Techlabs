package com.company.structural.adapter.model;

public class Mp4Player implements AdvanceMediaPlayer{

	@Override
	public void playMp4(String fileName) {
		System.out.println("Mp4 file is playing : " + fileName);
	}

	@Override
	public void playAVI(String fileName) {
		// not supported
		
	}

}
