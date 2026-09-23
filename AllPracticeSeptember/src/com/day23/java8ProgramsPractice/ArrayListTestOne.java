package com.day23.java8ProgramsPractice;

import java.util.ArrayList;

// To add elements to an ArrayList, use the add() method:

public class ArrayListTestOne {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println("Cars in list : "+cars);

	}
}
