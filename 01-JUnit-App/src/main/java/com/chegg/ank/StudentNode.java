package com.chegg.ank;

public class StudentNode {

	

	private Student std;
	private StudentNode next;
	private StudentNode previous;
	
	public StudentNode(Student std) {
		super();
		this.std = std;
	}

	public Student getStd() {
		return std;
	}

	public void setStd(Student std) {
		this.std = std;
	}

	public StudentNode getNext() {
		return next;
	}

	public void setNext(StudentNode next) {
		this.next = next;
	}

	public StudentNode getPrevious() {
		return previous;
	}

	public void setPrevious(StudentNode previous) {
		this.previous = previous;
	}

    public String toString() {
        return std.toString();
    }

	
	
	
	
	
}
