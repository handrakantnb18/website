package com.day5.java17features;

// use a lambda expression that does 
// not take any parameters.

interface Sayable {
	public String say();
}

public class LambdaExprDrawThree {

	public static void main(String[] args) {

		Sayable s = () -> {
			return "I have nothing to say.";
		};
		System.out.println(s.say());
	}
}
