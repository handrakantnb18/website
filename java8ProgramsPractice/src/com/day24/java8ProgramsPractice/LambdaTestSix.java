package com.day24.java8ProgramsPractice;

// we use a lambda expression with forEach to iterate over a collection.

import java.util.ArrayList;
import java.util.List;

public class LambdaTestSix {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Ankit");
		list.add("Mayank");
		list.add("Pooja");
		list.add("Jai");
		
		list.forEach(
				(n) -> System.out.println(n));
	}
}
