package com.company.structural.adapter.model;

public class MediaAdapter implements MediaPlayer{

	private AdvanceMediaPlayer advance;
	
	public MediaAdapter(String fileType)
	{
		if(fileType.equalsIgnoreCase("mp4"))
		{
			advance = new Mp4Player();
		}
		else
		{
			advance = new AVIPlayer();
		}
	}

	@Override
	public void play(String fileType, String fileName) {
		if(fileType.equalsIgnoreCase("mp4"))
		{
			advance.playMp4(fileName);
		}
		
		advance.playAVI(fileName);
		
	}
}
