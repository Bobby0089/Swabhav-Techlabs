package com.company.model;

public class SharedResources {

	public void printTable(int n)
	{
		for(int i = 0; i < 6; i++)
		{
			System.out.println(n+" * "+i+" = "+i*n);
			try
			{
				Thread.sleep(1500);
			}catch(Exception e)
			{
				e.getMessage();
			}
		}
	}
}
