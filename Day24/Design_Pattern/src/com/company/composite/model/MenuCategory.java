package com.company.composite.model;

import java.util.ArrayList;
import java.util.List;

//composite class
public class MenuCategory implements MenuComponent{
	
	private String Category;
	List<MenuComponent> components;
	
	public MenuCategory(String name)
	{
		this.Category = name;
		components = new ArrayList<>();
	}

	public void add(MenuComponent MenuComponents)
	{
		components.add(MenuComponents);
	}
	
	@Override
	public void showMenu() {
		System.out.println("Category : "+Category);
		
		for(MenuComponent c : components)
		{
			c.showMenu();
		}
		
	}

}
