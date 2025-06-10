package com.company.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@Nested
@DisplayName("Class 1 testing ")
class TestAll {

//private static int num = 1;
	
	
//	@BeforeAll
//	static void beforeAll()
//	{
//		System.out.println("Testing Starts");
//	}
//	
//	@AfterAll
//	static void afterAll()
//	{
//		System.out.println("Testing ends");
//	}
//	
//	@BeforeEach
//	void beforeEach()
//	{
//		System.out.println("Test case "+num+" starts");
//	}
//	
//	@AfterEach
//	void afterEach()
//	{
//		System.out.println("Test case "+num+" ends");
//		num++;
//	}

	@Test
	@DisplayName("Addition")
	void test1() {
		Calculator cal = new Calculator();
		double output = cal.add(5, 8);
		assertEquals(13, output);
		
	}

	@Test
	@DisplayName("Subtraction")
	void test2() {
		Calculator cal = new Calculator();
		double output = cal.subtraction(10, 4);
		assertEquals(6, output);
	}

	
}

@Nested
@DisplayName("Class 2 testing")
class TestDemo
{

	@Test
    @DisplayName("Multiplication")
    void test3() {
        Calculator cal = new Calculator();
        double output = cal.Multipication(21.0, 21.0);
        assertEquals(441.0, output);
    }
	
	 @Test
     @DisplayName("Division")
     void test4() {
         Calculator cal = new Calculator();
         double output = cal.div(4, 2);
         assertEquals(2, output);
     }

}
