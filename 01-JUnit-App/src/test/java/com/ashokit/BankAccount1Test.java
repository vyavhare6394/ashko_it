package com.ashokit;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.BeforeClass;
import org.junit.Test;

public class BankAccount1Test {
	private static BankAccount1 ba=null;;
	private static BankAccount1 ba1=null;
	
	@BeforeClass
	public static void init() {
		ba = new BankAccount1("B123");
		ba1=new BankAccount1(0, "B123");

	
	}
	
	
	@Test
	public void testAccountID_01() {
		
				String acutalResult = ba.getAccountID();
	
				String expectedResult="B123";
				
				assertEquals( expectedResult, acutalResult);
				
			
				
	}

	
	
	
	 
	@Test void testDepositingAmount_01() {
	  
		ba.deposit(45600.00);
	
	  	Double actualBalance = ba.getBalance();
	  
	    System.out.println( actualBalance );
	 
	   	Double expectedBalance =45600.00;
	  
	   	assertEquals(expectedBalance,actualBalance);
	  
	  
	  }
	
	 
		@Test 
		void testWithdrawAmount_01() {
		  
			Boolean actualwithdraw = ba.withdraw(5600.00);
		
			Boolean expectedWithdraw=true;
			
			
			
		   	assertEquals(expectedWithdraw,actualwithdraw);
		  
		  
		  }
		
		
	
	 
	
	
	
	
	
	
	
}
