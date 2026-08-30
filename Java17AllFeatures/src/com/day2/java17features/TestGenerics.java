package com.day2.java17features;

// A generic class is a class that can work with different data types
// It uses a type parameter (commonly T) to define the 
// type of data it will store and operate on.
class MyGen<T> {
	T obj;
	
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}
}

public class TestGenerics {

	public static void main(String[] args) {
		
		MyGen<Integer> g = new MyGen<Integer>();
		g.add(500);
		
		System.out.println(g.get());
	}
}
