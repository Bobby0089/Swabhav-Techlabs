package com.company.HomeAutomationSystem;

public interface ISmartDevice {

	void turnOn();
	
	void turnOff();
	
	void ConfigureSetting(String Setting) throws InvalidSettingException;
}
