package com.company.behavioural.template.model;

public class Coffee extends BevaragesTemplete {

	@Override
	protected void brew() {
		System.out.println("Adding coffee powder");
		
	}

	@Override
	protected void addCondiments() {
		System.out.println("adding Milk");
		
	}

}
