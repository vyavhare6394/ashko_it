package com.ashokit;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SpaiderTest {

	
private static Bug bug=null;
	
	@BeforeClass
	public static void init() {
		bug=new Spaider("xyz", 10);
	}
	
	@Test
	public void testSpecialTrait() {
	
		String actualResult = bug.specialTrait();
		
		String expectedResult="webs";
		
		assertEquals(expectedResult, actualResult);
		
	}
	
	
	@AfterClass
	public static void destroy() {
		bug=null;
	}
	
	
	
	
}
