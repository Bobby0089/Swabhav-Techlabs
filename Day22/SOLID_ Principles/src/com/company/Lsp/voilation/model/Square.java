package com.company.Lsp.voilation.model;

public class Square extends Rectangle {

	public void setHeight(double height)
	{
		this.height = height;
		this.length = height;
	}
	
	public void setLength(double length)
	{
		this.height = length;
		this.length = length;
	}
	
	
}
