package com.ashokit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K,V> implements Map {

	
	private ArrayList table;

	   private int maxTableSize = 50;
	   private int tableSize = 0;

	   public MyHashMap() {
	       table = new ArrayList();
	       this.clear();
	   }
	
	
	
	public int size() {
		// TODO Auto-generated method stub
		 return this.tableSize;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public void putAll(Map m) {
		// TODO Auto-generated method stub
		
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}


}
