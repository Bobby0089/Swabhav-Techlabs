package com.company.behavioural.template.model;

public class Tea extends BevaragesTemplete{

	@Override
	protected void brew() {
		System.out.println("steeping leaves");
	}

	@Override
	protected void addCondiments() {
		System.out.println("adding sugar");
	}
	
	

}
