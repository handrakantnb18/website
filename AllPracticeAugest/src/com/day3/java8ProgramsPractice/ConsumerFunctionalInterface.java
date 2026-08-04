package com.day3.java8ProgramsPractice;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {

	// Accepts input and performs an operation without returning anything
	public static void main(String[] args) {
		
		Consumer<String> print = name -> System.out.println(name);
		
		print.accept("chandrakant");
		
	}
}
