package com.company.test;

import com.company.model.MyThread;

public class MyThreadDemo {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.start();
		System.out.println("Main class thread");
	}

}
