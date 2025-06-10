package com.company.structural.proxy.test;

import com.company.structural.proxy.model.YouTubeProxy;
import com.company.structural.proxy.model.YouTubeService;

public class YouTubeProxyTest {

	public static void main(String[] args) {
		
		YouTubeService video = new YouTubeProxy();
		 try
		 { 
			 video.watchVideo("bbb", 20);
			 video.watchVideo("ccc", 25);
			 video.watchVideo("aaa", 15);
		 }catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }

	}

}
