package com.chegg.ank;

public class LinkedList {

	
private 	Node head;
	private Node tail;
	
	
	
	
	
	
	public Node findNodeWithData(int data) {
		
		
		return null;
	}

	
	
	
public void addDataAfterNode(int data,Node node) {
	
	
	   // save the reference to the header so we can return it.
       Node ret = node;

       // check base case, header is null.
       if (node == null) {
          
    	   new Node(data, null);
    	   
       }

       // loop until we find the end of the list
       while ((head.getNext()!= null)) {
           head = head.getNext();
       }

       // set the new node to the Object x, next will be null.
       header.next = new Node(x, null);
       return ret;
	  
	
}


}


