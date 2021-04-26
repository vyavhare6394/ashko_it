package com.ashokit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomDateTest {
	
		
	private static CustomDate cdate=null;
	
	@BeforeClass
	public static void init() {
		cdate =new CustomDate(12, 5, 2020);
	}
	

	@Test
	public void testIsLeapYear() {
		
		boolean leapYear = cdate.isLeapYear();
		
		
		assertTrue(leapYear);
		
	}
	
	@Test
	public void  testAdvanceOneDay() {
		
		cdate.advanceOneDay();
		
		int actualResult = cdate.getDay();
	
	int expectedResult=13;
	
	
	assertEquals(expectedResult, actualResult);
	}
	
	
	@Test
	public void testAdvanceOneWeek() {
		
		cdate.advanceOneWeek();
		
		int actualResult = cdate.getDay();
		
		int expectedResult=12;
		
		assertEquals(expectedResult, actualResult);
			
		
	}
	
	
	@AfterClass
	public static void destory() {
		cdate = null;
	}
	
	
	
	
}
