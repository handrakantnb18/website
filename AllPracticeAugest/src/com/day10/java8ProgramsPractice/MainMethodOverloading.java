package com.day10.java8ProgramsPractice;

//Class Adder contains overloaded methods to add integers    
class Adder {
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		return a + b + c;
	}
}
public class MainMethodOverloading {

	public static void main(String[] args) {
		
		System.out.println(Adder.add(18, 18));
		
		System.out.println(Adder.add(18, 18, 18));
		
	}
}
