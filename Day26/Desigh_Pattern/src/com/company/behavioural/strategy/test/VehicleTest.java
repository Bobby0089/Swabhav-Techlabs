package com.company.behavioural.strategy.test;

import com.company.behavioural.strategy.model.GoodVehicle;
import com.company.behavioural.strategy.model.OffRoadVehicle;
import com.company.behavioural.strategy.model.Sportsvehicle;
import com.company.behavioural.strategy.model.Vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle good = new GoodVehicle();
		Vehicle sport = new Sportsvehicle();
		Vehicle offRoad = new OffRoadVehicle();
		
		good.drive();
		sport.drive();
		offRoad.drive();
	}

}
