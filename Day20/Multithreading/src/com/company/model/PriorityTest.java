package com.company.model;

public class PriorityTest implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +" priority : "+Thread.currentThread().getPriority());
		
	}

}
