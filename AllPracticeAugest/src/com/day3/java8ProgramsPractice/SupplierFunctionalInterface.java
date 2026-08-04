package com.day3.java8ProgramsPractice;

import java.util.function.Supplier;

public class SupplierFunctionalInterface {

	// Returns a value without taking any input.
	public static void main(String[] args) {
		
		Supplier<String> message = () -> "Welcome to java";
		
		System.out.println(message.get());
	}
}
