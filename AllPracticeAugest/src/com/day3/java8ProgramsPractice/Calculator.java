package com.day3.java8ProgramsPractice;

// The @FunctionalInterface annotation is optional, but recommended 
// because the compiler checks that the interface contains only one abstract method.
@FunctionalInterface
interface Test {
	
	int calculate(int a, int b);
	
}
public class Calculator {

	public static void main(String[] args) {
		
		Test add = (a, b) -> a + b;
		
		System.out.println(add.calculate(10, 20));
		
	}
}
