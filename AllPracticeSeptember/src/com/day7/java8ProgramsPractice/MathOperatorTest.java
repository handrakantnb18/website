package com.day7.java8ProgramsPractice;

class Addar {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class MathOperatorTest {

	public static void main(String[] args) {

		System.out.println(Addar.add(11, 11));
		
		System.out.println(Addar.add(11, 11, 11));
		
	}
}
