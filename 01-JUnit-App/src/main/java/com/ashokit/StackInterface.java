package com.ashokit;

public interface StackInterface<T> {

public 	<E> E pop();

public <E> E peek();

public <E> E push(E item);

public boolean empty();

int search(Object o);

}
