package com.ashokit;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest1 {

	private static Calculator calc = null;

	@BeforeClass
	public static void init() {
		calc = new Calculator();
	}

	@Test
	public void testAdd_01() {
		Integer actualResult = calc.add(10, 20);
		Integer expectedResult = 30;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testAdd_02() {
		Integer actual = calc.add(50, 100);
		Integer expected = 150;
		assertEquals(expected, actual);
	}

	@Test
	public void testAdd_03() {
		Integer actual = calc.add(100, 200);
		Integer expected = 300;
		assertEquals(expected, actual);
	}

	@Test
	public void testMul_01() {
		Integer actual = calc.mul(2, 5);
		Integer expected = 10;
		assertEquals(expected, actual);
	}

	@Test
	public void testDiv_01() {
		Integer actual = calc.div(10, 2);
		Integer expected = 5;
		assertEquals(expected, actual);
	}

	@Test(expected = ArithmeticException.class)
	public void testDiv_02() {
		calc.div(10, 0);
	}

	@Test(timeout = 1000)
	public void testDiv_03() {
		calc.div(10, 2);
	}

	@AfterClass
	public static void destory() {
		calc = null;
	}
}
