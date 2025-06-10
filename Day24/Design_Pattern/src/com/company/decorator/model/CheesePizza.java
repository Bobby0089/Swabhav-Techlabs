package com.company.decorator.model;

public class CheesePizza implements BasePizza{

	@Override
	public double amount() {
		return 200;
	}

	@Override
	public String discription()
	{
		// TODO Auto-generated method stub
		return "Cheese Pizza";
	}

}
