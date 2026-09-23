package com.day23.java8ProgramsPractice;

import java.util.ArrayList;

// add an element at a specified position by referring to the index number:

public class ArrayListTestTwo {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");

		cars.add(0, "Mazda");

		System.out.println(cars);

	}
}
