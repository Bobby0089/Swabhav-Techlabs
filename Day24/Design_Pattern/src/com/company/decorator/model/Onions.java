package com.company.decorator.model;

public class Onions implements ToopingsDecorator{

	BasePizza basePizza;

	public Onions(BasePizza basePizza) {
		this.basePizza = basePizza;
	}

	
	@Override
	public double amount() {
		// TODO Auto-generated method stub
		return this.basePizza.amount() + 25;
	}

	@Override
	public String discription() {
		// TODO Auto-generated method stub
		return basePizza.discription() + " + Onions";
		
	}
}
