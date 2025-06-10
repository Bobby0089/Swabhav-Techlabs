package com.company.composite.model;

//leaf class
public class MenuItem implements MenuComponent{

	private String name;
	
	public MenuItem(String name)
	{
		this.name = name;
	}

	@Override
	public void showMenu()
	{
		System.out.println("Item : " + name);
	}
}
