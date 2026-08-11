package com.day10.java8ProgramsPractice;

//Class Adder contains overloaded methods to add integers    
class Adder {
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	// Method to add two doubles  
	static double add(double a, double b) {
		return a - b;
	}
	
}

public class MainMethodOverloading {

	public static void main(String[] args) {
		
		System.out.println(Adder.add(18, 18));
		
		System.out.println(Adder.add(18, 18, 18));

		//Calling the add method with two doubles    
		System.out.println(Adder.add(18.55, 45.50));
		
		
	}
}
