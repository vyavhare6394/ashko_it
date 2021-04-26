package com.ashokit;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	
	private static Calculator calc1 = null;

	private static Calculator calc2 = null;
	
	
	@BeforeClass
	public static void setup() {
		calc1 = new Calculator();
		calc2 = new Calculator();
	}
	
	
	@Test
	public void testAddition() {
		Integer actual = calc1.add(3, 4);
		Integer expected = 7;
		assertEquals(expected, actual);
	}
	
	
	@Test(expected = ArithmeticException.class)
	public void testDivisionErr() {
		calc2.div(10, 0);
	}

	
	
	
	
	
	@AfterClass
	public static void tearDown() {
		calc1 = null;
		calc2 = null;
	}
	
	
	

}
