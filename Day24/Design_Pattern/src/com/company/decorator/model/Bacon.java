package com.company.decorator.model;

public class Bacon implements ToopingsDecorator{

	BasePizza basePizza;

	public Bacon(BasePizza basePizza) {
		this.basePizza = basePizza;
	}
	
	@Override
	public double amount() {
		// TODO Auto-generated method stub
		return this.basePizza.amount() + 75;
	}

	@Override
	public String discription() {
		// TODO Auto-generated method stub
		return basePizza.discription() + " + Bacon";
	}
}
