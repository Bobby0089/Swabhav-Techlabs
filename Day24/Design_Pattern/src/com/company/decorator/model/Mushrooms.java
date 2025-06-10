package com.company.decorator.model;

public class Mushrooms implements ToopingsDecorator{

	BasePizza basePizza;

	public Mushrooms(BasePizza basePizza) {
		this.basePizza = basePizza;
	}
	
	@Override
	public double amount() {
		// TODO Auto-generated method stub
		return this.basePizza.amount() + 50;
	}

	@Override
	public String discription() {
		// TODO Auto-generated method stub
		return basePizza.discription() + " + Mushrooms";
		
	}
}
