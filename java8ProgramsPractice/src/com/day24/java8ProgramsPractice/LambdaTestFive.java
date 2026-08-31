package com.day24.java8ProgramsPractice;

// we demonstrate lambda expressions with and without using the return keyword.

interface Addable {
	int add(int a, int b);
}


public class LambdaTestFive {

	public static void main(String[] args) {
		
		Addable ad1 = (a,b) -> (a+b);
		System.out.println(ad1.add(10, 20));
		
		Addable ad2 = (int a, int b) -> {
			return (a+b);
		};
		
		System.out.println(ad2.add(100, 200));
		
	}
}
