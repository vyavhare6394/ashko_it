package com.ashokit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

	public static void main(String[] args) {
		
	
		
		List<Employee> emp1=new ArrayList<Employee>();
		
		emp1.add(new Employee("A101", "Ankush Vyavhare"));
		
		emp1.add(new Employee("A102", "Shantanu Tikale"));
		 

		List<Employee> emp2=new ArrayList<Employee>();
		
		emp2.add(new Employee("A103", "Suraj Raut"));
		
		emp2.add(new Employee("A104", "Shubham Nayab"));
		
		emp2.add(new Employee("A105", "Rajeshwar Roztkar"));
		
		List<Department> deptList=new ArrayList<Department>();
		

		Department dept2=new Department(102,"Electronic Engineer",emp2);

		
	Department dept1=new Department(101,"Computer Science",emp1);
	
	
	
	deptList.add(dept1);
	
	deptList.add(dept2);
	
	Collections.sort(deptList);
	
	
	for(Department de : deptList) {
		
		System.out.println(de);
		
	}
		
		
		
	}
	
}
