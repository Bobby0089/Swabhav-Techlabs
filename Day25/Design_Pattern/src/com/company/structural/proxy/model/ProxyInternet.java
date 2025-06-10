package com.company.structural.proxy.model;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

	private RealInternet realInternet = new RealInternet();
	private static List<String> blockedSite = new ArrayList<>();
	
	static
	{
		blockedSite.add("telegram.com");
		blockedSite.add("stake.com");
		blockedSite.add("chatgpt.com");
	}
	
	@Override
	public void connectTo(String serverHost) throws Exception {
		if(blockedSite.contains(serverHost.toLowerCase()))
		{
			throw new Exception("Access Denied to "+serverHost);
		}
		realInternet.connectTo(serverHost);
	}
	
}
