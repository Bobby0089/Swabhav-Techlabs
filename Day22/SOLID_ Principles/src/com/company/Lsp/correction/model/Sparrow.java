package com.company.Lsp.correction.model;

public class Sparrow implements IFlyable, IBird{

	@Override
	public void BodyColour() {
		System.out.println("sparow has brown colour");
	}

	@Override
	public void fly() {
		System.out.println("sparrow is flying");
	}

}
