package com.company.structural.proxy.test;

import com.company.structural.proxy.model.Internet;
import com.company.structural.proxy.model.ProxyInternet;
import com.company.structural.proxy.model.RealInternet;

public class ProxyTest {
	
	public static void main(String[] args) {
		
		Internet internet = new ProxyInternet();
		
		try
		{
			internet.connectTo("whatsapp.com");
			internet.connectTo("instagram.com");
			internet.connectTo("chatgpt.com");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
