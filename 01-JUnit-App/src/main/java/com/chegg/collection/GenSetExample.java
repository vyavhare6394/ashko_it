package com.chegg.collection;

import java.util.HashSet;
import java.util.Set;

public class GenSetExample {

	
	
	public static void main(String[] args) {
		
		
		Set<String> set=new HashSet<String>();
		
		set.add("one");
		set.add("second");
		set.add("3rd");
		
		/*We can not add integer object in  set becuase we specify the String object Set as generic type
		 * */
		//set.add(new Integer(4));
		
		//set can not allow to store duplicate object
		set.add("second");
		
		System.out.println(set);
		
	}
	
	
	
}
