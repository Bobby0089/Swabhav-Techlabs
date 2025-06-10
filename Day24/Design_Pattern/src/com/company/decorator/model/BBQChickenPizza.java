package com.company.decorator.model;

public class BBQChickenPizza implements BasePizza{

	@Override
	public double amount() {
		return 400;
	}

	@Override
	public String discription() {
		return "BBQ Chicken Pizza";
	}

}
