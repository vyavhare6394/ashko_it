package com.ashokit;

public class codeTracing {

	public static void main(String[] args) {
		
		int x;
		
		String s1,s2;
		
		s1="The team won the game";
		
		int pos=s1.indexOf("e");
		
		
		s2=s1.substring(4,pos+6);
		
		System.out.println(s2);
		
		s1=s1.replace('t','T').substring(13);
		
		System.out.println(s1);
		
		x=s2.indexOf(s1.charAt(3));
		
		System.out.println(x);
		
		System.out.println(s1.length());
		
	}
}
