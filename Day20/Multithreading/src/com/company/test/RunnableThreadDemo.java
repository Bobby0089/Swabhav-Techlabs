package com.company.test;

import com.company.model.RunnableThread;

public class RunnableThreadDemo {

	public static void main(String[] args) {
		
		RunnableThread thread1 = new RunnableThread();
		Thread t1 = new Thread(thread1);
		t1.start();
		System.out.println(t1.currentThread().getName());
		for(int i =0; i < 10; i++)
		{
			System.out.println("Main thread class value of i : "+i);
			try
			{
				Thread.sleep(100);
			}catch(Exception e)
			{
				
			}
		}

	}

}
