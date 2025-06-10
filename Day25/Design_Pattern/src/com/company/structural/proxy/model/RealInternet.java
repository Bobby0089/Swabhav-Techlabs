package com.company.structural.proxy.model;

public class RealInternet implements Internet{

	@Override
	public void connectTo(String serverHost) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Connecting to : " + serverHost);
	}

}
