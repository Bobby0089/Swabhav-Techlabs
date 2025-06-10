package com.company.decorator.model;

public class PepperoniPizza implements BasePizza{

	@Override
	public double amount() {
		return 350;
	}

	@Override
	public String discription() {
		return "Pepperoni Pizza";	
	}

}
