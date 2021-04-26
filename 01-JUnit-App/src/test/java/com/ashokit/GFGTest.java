package com.ashokit;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class GFGTest {
	
	

	private static GFG gfg = null;

	@BeforeClass
	public static void init() {

	
	gfg=new GFG();
	
	}

	
	
	@Test
	public void testAmountWithdrawing() {

		Integer actualResult = GFG.amountWithdrawing(4500, 500);
		
	
		Integer expectedResult=4000;
		
		assertEquals(expectedResult, actualResult);
	}

	
	@Test
	public void testAmountDepositing() {

		Integer actualResult = GFG.amountDepositing(4500, 500);
		
	
		Integer expectedResult=5000;
		
		assertEquals(expectedResult, actualResult);
	}


	
	
	
	
	
	@AfterClass
	public static void destory() {
		gfg = null;
	}
	
}
