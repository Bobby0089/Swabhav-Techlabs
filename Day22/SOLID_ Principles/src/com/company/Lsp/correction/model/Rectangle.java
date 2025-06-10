package com.company.Lsp.correction.model;

public class Rectangle implements IShape{

	private double length;
	private double breadth;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	@Override
	public double getArea() {
		return length * breadth;
	}
	
	
}
