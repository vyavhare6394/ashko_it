package com.chegg.ank;

public class StudentList {

	
	
	private StudentNode head;
	
	private StudentNode tail;
	
	private int size;
	 
	
	
    public void addToFront(Student student) {
        StudentNode node = new StudentNode(student);

        if (head == null) {
            tail = node;
        }
        else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

	
    
    public void addToEnd(Student student) {
        StudentNode node = new StudentNode(student);
        if (tail == null) {
            head = node;
        }
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    
    public StudentNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        StudentNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        }
        else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    
    
    public StudentNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        StudentNode removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        }
        else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    
    public int getSize() {
        return size;
    }


    public boolean isEmpty() {
        return head == null;
    }


    
    public void printList() {
        StudentNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }



	@Override
	public String toString() {
		return "StudentList [head=" + head + ", tail=" + tail + ", size=" + size + "]";
	}

    
    
    
}
