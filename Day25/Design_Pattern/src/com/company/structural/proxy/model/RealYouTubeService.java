package com.company.structural.proxy.model;

public class RealYouTubeService implements YouTubeService{

	@Override
	public void watchVideo(String videoName, int userAge) throws Exception {
		System.out.println("Watching Video : "+ videoName);
	}

}
