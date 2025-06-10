package com.company.model;

public class Shared1 extends Thread {
	SharedResources sc;

	public Shared1(SharedResources sc) {
		this.sc = sc;
	}
	
	@Override
	public void run()
	{
		sc.printTable(3);
	}
	
	
}
