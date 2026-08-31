package com.day24.java8ProgramsPractice;

// lambda expression with a single parameter to process input.

interface Sayable1 {
	public String say(String name);
}

public class LambdaTestThree {

	public static void main(String[] args) {
		
		Sayable1 s1 = (name) -> {
			return "Hello, "+name;
		};
		
		System.out.println(s1.say("chandrakant"));
		
		Sayable1 s2 = name -> {
			return "Hello, "+name;
		};
		
		System.out.println(s2.say("Priyanka"));
		
	}
}
