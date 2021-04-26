package com.ashokit;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RentCalculatorTest {

	   @Rule
	    public ExpectedException thrown = ExpectedException.none();
	
	@BeforeClass
	public static void setup() {
			}
	
	@Test
	public void testGetTotalRentPAyment() {
		
		RentCalculator		calc1 = new RentCalculator(2500,5,20000);

		
		Double actualResult = calc1.getTotalRentPayment();
		
		Double expectedResult=112500.0;
		
		assertEquals(expectedResult,actualResult);
	}
	
	
	@Test(expected = Exception.class)
	public void testSetRentAmount() throws Exception  {
		

		RentCalculator		calc1 = new RentCalculator();

		calc1.setRentAmount(-2500);
		
		 thrown.expect(Exception.class);
	        //you can test the exception message like
	        thrown.expectMessage("Money Can not negative");
		
		
				
			}
	

	
	
}
