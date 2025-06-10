package com.company.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Test2 {
	
	@Test
	@DisplayName("Multiplication")
	void test3() {
		Calculator cal = new Calculator();
		double output = cal.Multipication(21, 21);
		assertEquals(441, output);
	}
	
	@Test
	@DisplayName("Division")
	//@Disabled("Skip")
	void test4() {
		Calculator cal = new Calculator();
		double output = cal.div(4, 2);
		assertEquals(2	, output);
	}


}
