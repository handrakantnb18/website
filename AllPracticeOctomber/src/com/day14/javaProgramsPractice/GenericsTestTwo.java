package com.day14.javaProgramsPractice;

// create methods that work with any data type using generics

public class GenericsTestTwo {

	public static <T> void printArray(T[] array) {
		for (T item : array) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {

		String[] names = { "Jenny", "Liam" };

		Integer[] numbers = { 1, 2, 3 };

		printArray(names);
		printArray(numbers);

	}
}
