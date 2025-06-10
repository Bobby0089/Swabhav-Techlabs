package com.company.Lsp.correction.test;

import com.company.Lsp.correction.model.Rectangle;
import com.company.Lsp.correction.model.Square;

public class ShapeTest {
public static void main(String[] args) {
	
	Rectangle rectangle = new Rectangle();
	rectangle.setLength(15);
	rectangle.setBreadth(20);
	System.out.println("Area of Rectangle : " + rectangle.getArea());
	
	Square square = new Square();
	square.setSide(6);
	System.out.println("Area of Square : " + square.getArea());
}
}
