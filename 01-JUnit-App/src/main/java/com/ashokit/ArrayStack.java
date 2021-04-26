package com.ashokit;

import java.util.EmptyStackException;

public class ArrayStack<E> implements StackInterface<E> {
	   Object[] array;
	   static final int DEFAULT_MAX_SIZE = 50;
	   int maxSize;
	   int top;

	   public ArrayStack() {
	       this(DEFAULT_MAX_SIZE);
	   }

	   public ArrayStack(int maxSize) {
	       array = new Object[maxSize];
	       top = 0;
	   }

	   @Override
	   public E pop() {


	   if (empty()) {
	            throw new EmptyStackException();
	        }

	        Object obj = array[--top];
	        array[top] = null;
	        return (E) obj;
	   }

	   @SuppressWarnings("unchecked")
	   @Override
	   public E peek() {


		 if (empty()) {
	        	    throw new EmptyStackException();
	        	}

	        return (E) array[top - 1];
	   }


	   
		
		  @Override
		   public  <E> E push(E item) {

		  if (top == array.length) {
		            // need to resize the backing array
		            Object[] newArray = new Object[2 * array.length];
		            System.arraycopy(array, 0, newArray, 0, array.length);
		            array = newArray;
		        }

		     return   (E) (array[top++] = item);

		   }
	   

	   @Override
	   public boolean empty() {
	       return top == 0;
	   }

	   @Override
	   public int search(Object o) {
	       return -1;
	   }
		

	}