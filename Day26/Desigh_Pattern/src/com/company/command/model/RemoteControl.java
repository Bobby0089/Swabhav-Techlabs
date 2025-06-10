package com.company.command.model;

public class RemoteControl {
	
	private Command command;
	
	public void setCommand(Command command)
	{
		this.command = command;
	}
	
	public void pressButton()
	{
		command.execute();
	}

}
