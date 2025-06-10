package com.company.Lsp.correction.model;

public class Pigeon implements IBird, IFlyable{

	@Override
	public void fly() {
		System.out.println("Pigeon is flying");
	}

	@Override
	public void BodyColour() {
		System.out.println("Pigeon has white colour");
	}

}
