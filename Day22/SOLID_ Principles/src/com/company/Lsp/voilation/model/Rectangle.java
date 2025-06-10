package com.company.Lsp.voilation.model;

public class Rectangle {

	public double height;
	public double length;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea()
	{
		return length *height;
	}
	
}
