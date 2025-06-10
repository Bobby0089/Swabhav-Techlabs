package com.company.creation.singleton.model;

public class DataBaseConnection {
	
	private static DataBaseConnection instance;
	
	private DataBaseConnection()
	{
		
	}
	
	// Public method to get the single instance (lazy initialization)
	public static DataBaseConnection getInstance()
	{
		if(instance == null)
		{
			instance = new DataBaseConnection();
		}
		
		return instance;
	}

	public void connect()
	{
		System.out.println("Database Connected");
	}
	
	public void disConnect()
	{
		System.out.println("Database Disconnected");
	}
}
