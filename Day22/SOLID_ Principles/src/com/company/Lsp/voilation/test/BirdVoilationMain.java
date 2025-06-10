package com.company.Lsp.voilation.test;

import com.company.Lsp.voilation.model.Ostrich;
import com.company.Lsp.voilation.model.Pigeon;
import com.company.Lsp.voilation.model.Sparrow;

public class BirdVoilationMain {

	public static void main(String[] args) {
		Sparrow sparrow = new Sparrow();
		sparrow.Fly();
		Pigeon pigeon = new Pigeon();
		pigeon.Fly();
		Ostrich ostrich = new Ostrich();
		ostrich.Fly();
		

	}

}
