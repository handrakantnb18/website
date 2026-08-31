package com.day24.java8ProgramsPractice;

// we have defined a functional interface and referring a static method to it's functional method say().

interface Sayable2 {
	void say();
}

public class MethodReference {

	public static void saySomething() {
		System.out.println("My name is chandrakant bhosale");
	}
	
	public static void main(String[] args) {
		
		Sayable2 sayable2 = MethodReference::saySomething;
		
		sayable2.say();
	}
}
