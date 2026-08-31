package com.day24.java8ProgramsPractice;

// we use a lambda expression that does not take any parameters.

interface Sayable {
	public String say();
}

public class LambdaTestTwo {

	public static void main(String[] args) {
		
		Sayable s =() -> {
			return "My name is chandrakant bhosale";
		};
		
		System.out.println(s.say());
		
	}
}
