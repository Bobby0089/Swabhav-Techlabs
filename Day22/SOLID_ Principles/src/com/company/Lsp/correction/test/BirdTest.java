package com.company.Lsp.correction.test;

import com.company.Lsp.correction.model.Duck;
import com.company.Lsp.correction.model.Ostrich;
import com.company.Lsp.correction.model.Pigeon;
import com.company.Lsp.correction.model.Sparrow;

public class BirdTest {

	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.swim();
		duck.BodyColour();
		duck.walk();
		System.out.println("=======================");
		
		Sparrow sparrow = new Sparrow();
		sparrow.BodyColour();
		sparrow.fly();
		System.out.println("=======================");
		
		Pigeon pigeon = new Pigeon();
		pigeon.fly();
		pigeon.BodyColour();
		System.out.println("=======================");
		
		Ostrich ostrich = new Ostrich();
		ostrich.walk();
		ostrich.BodyColour();
	}

}
