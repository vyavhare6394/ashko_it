package com.ashokit;

public abstract class Bug {

	private String name;
	private int numLeg;
	
	
	public Bug(String name, int numLeg) {
		super();
		this.name = name;
		this.numLeg = numLeg;
	}


	public String getName() {
		return name;
	}


	public int getNumLeg() {
		return numLeg;
	}
	
	
	
	public boolean canFly() {
		
		return false;
	}
	
	
	public abstract String specialTrait();
}
