package com.company.structural.adapter.test;

import com.company.structural.adapter.model.MediaAdapter;
import com.company.structural.adapter.model.MediaPlayer;

public class AdapterTest {

	public static void main(String[] args) {
		
		MediaPlayer player = new MediaAdapter("Mp4");
		MediaPlayer player2 = new MediaAdapter("Avi");
		
		player.play("mp4","Dhol");
		player2.play("avi", "Hulchul");

	}

}
