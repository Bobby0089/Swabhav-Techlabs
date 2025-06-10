package com.company.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplicationTest {

	@Test
	void test() {
		Calculator cal = new Calculator();
		double output = cal.Multipication(21, 21);
		assertEquals(441, output);
	}

}
