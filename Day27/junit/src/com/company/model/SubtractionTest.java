package com.company.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubtractionTest {

	@Test
	void test() {
		Calculator cal = new Calculator();
		double output = cal.subtraction(10, 4);
		assertEquals(6, output);
	}

}
