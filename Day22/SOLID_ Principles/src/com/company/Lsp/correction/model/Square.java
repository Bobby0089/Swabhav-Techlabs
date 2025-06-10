package com.company.Lsp.correction.model;

public class Square implements IShape{

	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return side * side;
	}
	
}
