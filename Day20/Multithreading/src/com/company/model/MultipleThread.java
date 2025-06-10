package com.company.model;

public class MultipleThread implements Runnable{
	public String threadName;
	public int sleepTime;
	
	public MultipleThread(String threadName, int sleepTime)
	{
		this.threadName = threadName;
		this.sleepTime = sleepTime;
	}

	@Override
	public void run() {
		try
		{
			for(int i = 1; i < 6; i++)
			{
				System.out.println(threadName + " is working on .... iteration no : "+ i);
			}
			
			Thread.sleep(1500);
			
			System.out.println(threadName + " sleep time is : "+sleepTime);
		}catch(InterruptedException e)
		{
			System.out.println(threadName + " was interrupted");
		}
	}
	
	
}
