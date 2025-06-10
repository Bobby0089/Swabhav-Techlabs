package com.company.model;

public class RunnableThread implements Runnable{

		
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i =0; i < 10; i++)
		{
			System.out.println("RunnableThread class value of i : "+i);
			try
			{
				Thread.sleep(100);
			}catch(Exception e)
			{
				
			}
		}
		
	}

}
