package com.ashokit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class WaspTest {


private static Bug bug=null;
	
	@BeforeClass
	public static void init() {
		bug=new Wasp("Tig", 6);
	}
	
	@Test
	public void testCanFly() {
		
		boolean actualResult = bug.canFly();
	
	assertTrue(actualResult);
	
	}
	
	
	@Test
	public void testSpecialTrait() {
		
		
		String actual = bug.specialTrait();
	
		String expectd="nice";
		
		assertEquals(expectd, actual);
	
	}
	

	@AfterClass
	public static void destroy() {
		bug=null;
	}
	
	
}
