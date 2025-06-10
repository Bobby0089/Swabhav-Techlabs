package com.company.test;

import com.company.model.MultipleThread;

public class MultipleThreadTest {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MultipleThread("thread1",1500));
		System.out.println(t1.getState());
		Thread t2 = new Thread(new MultipleThread("thread2",2000));
		t1.start();
		System.out.println(t1.getState());
		t2.start();
		int n = t1.getPriority();
		System.out.println(n);
	}

}
