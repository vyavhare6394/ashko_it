package com.ashokit;

import java.util.ArrayList;
import java.util.List;

public class Department implements Comparable<Department>{

	private Integer dept_id;
	private String dept_name;
	private List<Employee> list;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
		
	
	
	
	
	public Department(Integer dept_id, String dept_name, List<Employee> list) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.list = list;
	}


	



	public Integer getDept_id() {
		return dept_id;
	}





	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}





	public String getDept_name() {
		return dept_name;
	}





	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}





	public List<Employee> getList() {
		return list;
	}





	public void setList(List<Employee> list) {
		this.list = list;
	}

	




	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + ", list=" + list + "]";
	}





	public int compareTo(Department o) {
		// TODO Auto-generated method stub
		return this.dept_id-o.dept_id;
	}
	
	
	
	
	
	
}
