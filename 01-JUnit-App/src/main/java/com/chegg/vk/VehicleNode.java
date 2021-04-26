package com.chegg.vk;

public class VehicleNode {

/* private Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;
 * 
 * */

	private Vehicle vehicle;
	private VehicleNode next;
	private VehicleNode previous;

	
	
	
	
	public VehicleNode getPrevious() {
		return previous;
	}

	public void setPrevious(VehicleNode previous) {
		this.previous = previous;
	}

	public VehicleNode(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public VehicleNode getNext() {
		return next;
	}

	public void setNext(VehicleNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "VehicleNode [vehicle=" + vehicle + ", next=" + next + ", previous=" + previous + "]";
	}
	
	
	

	
	
	

}
