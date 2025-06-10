package com.company.decorator.model;

public class VeggiePizza implements BasePizza{

	@Override
	public double amount() {
		return 250;
	}

	@Override
	public String discription() {
		return "VeggiePizza";
	}

}
