package com.company.command.model;

public class LightOffCommand implements Command{

	private Light light;

	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOff();
	}
	
	
}
