package com.company.behavioural.template.model;

public abstract class BevaragesTemplete {
	
	public final void preparingBevarage()
	{
		boilWater();
		brew();
		pourInCup();
		addCondiments();
		
	}
	
	private void boilWater()
	{
		System.out.println("Boiling water.");
	}
	
	private void pourInCup()
	{
		System.out.println("Pouring into cup");
	}
	
	protected abstract void brew();
	
	protected abstract void addCondiments();
}
