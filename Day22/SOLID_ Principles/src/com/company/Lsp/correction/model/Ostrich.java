package com.company.Lsp.correction.model;

public class Ostrich implements IBird, INonFlyable {

	@Override
	public void walk() {
		System.out.println("Ostrich is walking");
	}

	@Override
	public void BodyColour() {
		System.out.println("Ostrich has black and white colour");
	}

}
