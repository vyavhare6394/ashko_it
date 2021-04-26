package com.ashokit;

import java.util.ArrayList;

public class ListTest {
	
	

	public static void main(String[] args) {

		//LList<String> Names = new LList<String>(new ArrayList());

		LList<Integer> Numbers = new LList<Integer>(new ArrayList());

		  Numbers.add(1);
		  
		  Numbers.add(2); Numbers.add(3);
		  
		  Numbers.add(4);
		  
		  Numbers.add(5);
		  
		  
			/*
			 * Numbers.add(3,10);
			 * 
			 * 
			 * Numbers.add(4,40);
			 * 
			 * 
			 * Numbers.remove(2);
			 */  
		  
		  
		  for(Object temp : Numbers) {
	            System.out.println(temp);
	        }
		  
		  
		  
		  
		  
		  
			/*
			 * Names.add("One"); Names.add("Two"); Names.add("Three"); Names.add("Four");
			 * Names.add("Five"); Names.add(3,"Ten");
			 * 
			 * Names.add(4,"Forty");
			 * 
			 * Names.remove(2);
			 * 
			 * 
			 * Object[] t;
			 * 
			 * t=Numbers.toArray();
			 * 
			 * for(int i=0;i<t.length;i++) {
			 * 
			 * System.out.println(t[i]); }
			 * 
			 * 
			 * t=Names.toArray();
			 * 
			 * for(int i=0;i<t.length;i++) {
			 * 
			 * System.out.println(t[i]); }
			 * 
			 * 
			 */
		 
	}

}
