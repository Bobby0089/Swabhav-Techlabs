package com.company.model;

public class Shared2 extends Thread{
	SharedResources sc;

	public Shared2(SharedResources sc) {
		this.sc = sc;
	}
	
	@Override
	public void run()
	{
		sc.printTable(5);
	}
}
