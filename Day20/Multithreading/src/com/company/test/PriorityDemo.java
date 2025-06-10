package com.company.test;

import com.company.model.PriorityTest;

public class PriorityDemo {

	public static void main(String[] args) {
		Thread t1 = new Thread(new PriorityTest());
		Thread t2 = new Thread(new PriorityTest());
		Thread t3 = new Thread(new PriorityTest());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
