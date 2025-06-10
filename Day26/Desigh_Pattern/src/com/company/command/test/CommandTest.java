package com.company.command.test;

import com.company.command.model.Light;
import com.company.command.model.LightOffCommand;
import com.company.command.model.LightOnCommand;
import com.company.command.model.RemoteControl;

public class CommandTest {

	public static void main(String[] args) {
		Light light = new Light();
		
		LightOffCommand lightOff = new LightOffCommand(light);
		LightOnCommand lightOn = new LightOnCommand(light);
		
		RemoteControl remote = new RemoteControl();
		
		remote.setCommand(lightOn);
		remote.pressButton();
		
		remote.setCommand(lightOff);
		remote.pressButton();
	}

}
