package com.day10.javaProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// Maintains insertion order, Allows duplicate elements,Supports bidirectional

public class SetInterfaceTestOne {

	public static void main(String[] args) {

		List<String> li = new ArrayList<>();
		li.add("1. Java");
		li.add("2. Python");
		li.add("3. DSA");
		li.add("4. C++");
		li.add("5. Node");
		li.add("6. React");
		li.add("7. Spring");
		li.add("8 Angular");

		System.out.println("Elements of List are:");

		for (String s : li) {
			System.out.println(s);
		}

	}
}
