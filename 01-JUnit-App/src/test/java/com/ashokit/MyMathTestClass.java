package com.ashokit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.chegg.vk.MyMathClass;

public class MyMathTestClass {

	private static MyMathClass<Number> s1=null;
	
	
	@BeforeClass
	public static void init() {
	
		s1=new MyMathClass<Number>();
		

	}
	
	@Test
	public <T> void testAvg() {
	
		
		ArrayList<Number> I=new ArrayList<Number>();
		I.add(45);
		I.add(30);
		I.add(90);
		
		Double actualResult = s1.average(I);
		
		Double expectedResult=55.0;
		
		assertEquals(expectedResult, actualResult);
		
	}

	@Test
	public <T> void testDev() {
	

		ArrayList<Number> I=new ArrayList<Number>();
		I.add(45);
		I.add(30);
		I.add(90);
		
		Double actualResult = s1.stdDeviation(I);
		
		Double expectedResult=2.788866755113585;
		
		assertEquals(expectedResult, actualResult);
		
	}

	@AfterClass
	public static void destroy() {
	
		s1=null;
		

	}

	
}
