package com.chegg.ank;

public class testLinkedList {

	
	public static void main(String[] args) {
	
		

		Student s1=new Student("Saad");

		Student s2=new Student("Masood");
		

		Student s3=new Student("Ijad");

		Student s4=new Student("Siddiqui");
		
		
		StudentList  sl=new StudentList();
		
		sl.printList();
		
		sl.addToFront(s1);
		
		sl.printList();
		
		sl.addToFront(s2);
		
		sl.printList();
		
		sl.addToFront(s3);
		
		sl.printList();
		
		sl.removeFromFront();
		
		sl.printList();
		
		sl.addToFront(s4);
		
		sl.printList();
		
		
		
		System.out.println(sl);
		
	}
}
