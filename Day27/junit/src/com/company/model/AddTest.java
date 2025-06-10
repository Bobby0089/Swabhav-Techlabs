package com.company.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test() {
		Calculator cal = new Calculator();
		double output = cal.add(5, 8);
		assertEquals(13, output);
		
	}

}
