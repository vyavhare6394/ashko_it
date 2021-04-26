package com.ashokit;

public class Wasp extends Bug {

	public Wasp(String name, int numLeg) {
		super(name, numLeg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canFly() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public String specialTrait() {
		// TODO Auto-generated method stub
		return "nice";
	}

}
