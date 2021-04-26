package com.ashokit;

import java.util.Scanner;

public class AccountID {

	
	public static void main(String[] args) {
	    //creating an array of 10   
	   
	   
	   
	    //asking user to enter a number        
	    Scanner kb = new Scanner(System.in);
	    System.out.println("Enter and id number : ");
	   String num = kb.nextLine();
	   	
	    //calling method    
	    GetValidInteger(num);
	}
	//method
	static void GetValidInteger(String num) {
	    //looping through the array to get the numbers

		
		char[] charArray = num.toCharArray();
		
		
		for(int i=0;i<charArray.length;i++) {
	        //if num at index 0 is 1 print out invalid
	        if (Character.isLetter(charArray[0])) {
	        	
	        	 if( Character.isDigit(charArray[1])||Character.isDigit(charArray[2]) ||Character.isDigit(charArray[3])){
	        		 System.out.println("The number you have entered :" + num + " is valid");
	 	        }
	        	
	        	 else {
	        		 
	        		 System.out.println("After first Letter next Letter should be digit");
	        	 }
	        	
	        }

	        
	        else {
			System.out.println("First Letter sholud start with A-Z");	
			}
	    }
	}
	
	

}