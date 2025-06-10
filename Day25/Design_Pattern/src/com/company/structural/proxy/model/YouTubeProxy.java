package com.company.structural.proxy.model;

public class YouTubeProxy implements YouTubeService{

	private RealYouTubeService realYoutubeService = new RealYouTubeService();

	@Override
	public void watchVideo(String videoName, int userAge) throws Exception {
		if(userAge < 18)
		{
			throw new Exception("18+ video");
		}
	
		realYoutubeService.watchVideo(videoName, userAge);
		
	}

	
}
