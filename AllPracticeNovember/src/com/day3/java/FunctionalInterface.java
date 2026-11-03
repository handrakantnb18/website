package com.day3.java;

// How are functional interfaces and Lambda Expressions related

interface MyFunctionalInterface {
	
    void myMethod();
}

public class FunctionalInterface {

	public static void main(String[] args) {
		
		 MyFunctionalInterface myLambda = 
				 () -> System.out.println("Hello Chandrakant!");
		 
		 myLambda.myMethod();
		 
	}
}
