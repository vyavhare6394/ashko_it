package com.ashokit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MoneyTest {


	
	
	
	 //Testing that two Money objects are successfully added together
	   @Test
	   public void simpleAdd() throws Exception {
	       Money m12CAD= new Money(12, "CAD");
	       Money m14CAD= new Money(14, "CAD");
	       Money known= new Money(14, "CAD");
	       Money observed= m12CAD.add(m14CAD);
	       assertTrue(known.equals(observed));
	   }

	  

	   //testing that exception is thrown correctly
	   @Test (expected = Exception.class)
	   public void testNegativeMoneyValue () throws Exception{
		   Money m12CAD= new Money(12, "CAD");
	       Money m14CAD= new Money(14, "CAD");
	       Money observed= m12CAD.add(m14CAD);


	   }
	   
	   
	   
	   
	 //Test is unable to complete successfully because exception is thrown

	   @Test(expected = Exception.class)

	   public void simpleAddFailure() throws Exception {

	   Money m12CAD= new Money(12, "CAD");

	   Money m14CAD= new Money(-14, "CAD");

	   Money known= new Money(26, "CAD");

	   Money observed= m12CAD.add(m14CAD); 
	   
	   assertTrue(known.equals(observed));

	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
	

}
