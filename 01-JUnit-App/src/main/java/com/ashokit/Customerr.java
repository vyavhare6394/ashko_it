package com.ashokit;

import java.util.ArrayList;
import java.util.List;

public class Customerr extends User {


	private String []cart;
	List<String> al=null;
	
	public Customerr(String id, String pw, String fn, String ln, String email,String []s) {
		super(id, pw, fn, ln, email);	
		this.cart=s;
	}
	
	public void addCar(String vin) {
		
		al=new ArrayList<String>();
		
		al.add(vin);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Customerr cr =new Customerr("str123","ahshs","sdfg","djd","shhjshs", args); 
		
		System.out.println(cr.addCar("str"));
		
	}
	
	
	
	
	
}
