package com.chegg.vk;

public class Vehicles {

	
	private VehicleNode head;
	private VehicleNode tail;
	private int size;
	
	

    public void addToFront(Vehicle vehicle) {
        VehicleNode node = new VehicleNode(vehicle);

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

	
	
    public void addToEnd(Vehicle vehicle) {
        VehicleNode node = new VehicleNode(vehicle);
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

    public VehicleNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        VehicleNode removedNode = head;

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

    public VehicleNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        VehicleNode removedNode = tail;

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
        VehicleNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }


    
    
    
    
    
    
    
	
		
}
