package com.company.creation.singleton.model;

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton()
	{
		
	}

	public static Singleton getInstance()
	{
		if(instance == null)
		{
			instance = new Singleton();
		}
		
		return instance;
	}
	
	public void show()
	{
		System.out.println("In singleton class");
	}
}
