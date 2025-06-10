package com.company.command.model;

public class Text {
	
	public void bold()
	{
		System.out.println("Changing text style to BOLD.");
	}

	public void italic()
	{
		System.out.println("Changing text style to ITALIC.");
	}
	
	public void redo()
	{
		System.out.println("Redo function called");
	}
	
	public void undo()
	{
		System.out.println("Undo function called");
	}
}
