package com.ashokit;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerTest {

	
	private static Customer customer = null;

	@BeforeClass
	public static void init() {
		customer = new Customer("ankush", "vyavhare");
	}

	@Test
	public void testFirstName_01() {
		
		String actualResult = customer.getFirstName();
		
		String expectedResult="ankush";
		
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testLastName_02() {
		
		String actualResult = customer.getLastName();
		String expectedResult="vyavhare";
		
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCustomerNumber() {
		
		
		Integer actual = customer.getNumber();
		
		Integer expected=1;
		
		assertEquals(expected, actual);
		
		
	}
	
	
	
	
	
	@AfterClass
	public static void destory() {
		customer = null;
	}
	
	
}
