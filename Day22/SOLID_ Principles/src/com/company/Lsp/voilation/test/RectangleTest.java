package com.company.Lsp.voilation.test;

import com.company.Lsp.voilation.model.Rectangle;
import com.company.Lsp.voilation.model.Square;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(10);
		rectangle.setLength(25);
		System.out.println(rectangle.getArea());
		
		Square square = new Square();
		square.setHeight(4);
		System.out.println(square.getArea());
		
		square.setLength(10);
		System.out.println(square.getArea());
		

	}

}
