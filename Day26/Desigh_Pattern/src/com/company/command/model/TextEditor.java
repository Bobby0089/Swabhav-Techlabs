package com.company.command.model;

public class TextEditor {
	
	private TextCommand command;
	
	public void setCommand(TextCommand command)
	{
		this.command = command;
	}
	
	public void pressButton()
	{
		command.execute();
	}

}
