package com.day29.java8ProgramsPractice;

// Java that allows a class to have more than one method
// with the same name provided their parameter lists are 
// different. Itenables methods to perform similar but distinct tasks.

public class MethodOverloadingTest {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public double add(double a, double b) {
		return a + b;
	}
	
	public double add(double a, double b, double c) {
		return a + b + c;
	}
	
	public int add(int[] numbers) {
		int sum = 0; // Initializes sum to 0
		for(int number : numbers) {
			sum += number;
		}
		return sum;
		
	}
	
	// Main method to test the overloaded methods    
	public static void main(String[] args) {
		
		MethodOverloadingTest mt = new MethodOverloadingTest();
		
		System.out.println("First int sum     : "+mt.add(10, 20));
		
		System.out.println("Second int sum    : "+mt.add(10, 20, 50));
		
		System.out.println("Third Double sum  : "+mt.add(10.50, 20.50));
		
		System.out.println("Fourth Double sum : "+mt.add(10.50, 20.50, 30.50));
		
		System.out.println("Five Number sum   : "+mt.add(new int[] {1,2,3,4,5}));
		
	}
}
