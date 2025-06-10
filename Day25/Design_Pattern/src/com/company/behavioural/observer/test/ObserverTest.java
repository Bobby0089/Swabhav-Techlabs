package com.company.behavioural.observer.test;

import com.company.behavioural.observer.model.EmailDisplay;
import com.company.behavioural.observer.model.LEDDisplay;
import com.company.behavioural.observer.model.PhoneDisplay;
import com.company.behavioural.observer.model.WeatherStation;

public class ObserverTest {

	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		PhoneDisplay phoneDisplay = new PhoneDisplay();
		LEDDisplay ledDisplay = new LEDDisplay();
		EmailDisplay emailDisplay = new EmailDisplay();

		weatherStation.registerObserver(ledDisplay);
		weatherStation.registerObserver(phoneDisplay);
		weatherStation.registerObserver(emailDisplay);
		
		weatherStation.setTemperature(27);
		weatherStation.setTemperature(30);
		
		weatherStation.removeObserver(ledDisplay);
		weatherStation.setTemperature(40);
		
	}

}
