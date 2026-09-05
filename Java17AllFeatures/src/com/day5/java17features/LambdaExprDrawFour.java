package com.day5.java17features;

// use a lambda expression with a single 
// parameter to process input.

interface SayableTwo {
	public String say(String name);
}

public class LambdaExprDrawFour {

	public static void main(String[] args) {

		SayableTwo s1 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(s1.say("Sonoo"));

		SayableTwo s2 = name -> {
			return "Hello, " + name;
		};
		System.out.println(s2.say("Sonoo"));

	}
}
