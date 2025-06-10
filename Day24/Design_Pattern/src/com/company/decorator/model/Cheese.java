package com.company.decorator.model;

public class Cheese implements ToopingsDecorator {

	BasePizza basePizza;
	
	public Cheese(BasePizza basePizza) {
		this.basePizza = basePizza;
	}
	
	@Override
	public double amount() {
		
		return this.basePizza.amount() + 20;
	}

	@Override
	public String discription() {
		return basePizza.discription() + " + Cheese";
	}

	
}
