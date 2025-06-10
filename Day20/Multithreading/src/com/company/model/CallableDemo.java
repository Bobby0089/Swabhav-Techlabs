package com.company.model;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<String> {
	public String name;

	public CallableDemo(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(500);
		return name + " is completed.";
	}
	
}
