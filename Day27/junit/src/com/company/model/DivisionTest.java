package com.company.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisionTest {

	@Test
	void test() {
		Calculator cal = new Calculator();
		double output = cal.div(4, 2);
		assertEquals(2	, output);
	}

}
