package com.company.Lsp.correction.model;

public class Duck implements IBird, ISwimmable, INonFlyable {

	@Override
	public void swim() {
		System.out.println("Duck is swimming");
	}

	@Override
	public void BodyColour() {
		System.out.println("Duck has black colour");
	}

	@Override
	public void walk() {
		System.out.println("Duck is walking");
	}

}
