package com.day17.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// To update an element in a list, use the set() 
// method with the target index and the new value

public class ArrayListTestTwo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("1. Java");
		list.add("2. Python");
		list.add("3. DSA");
		list.add(1, "4. C++");

		System.out.println("Initial ArrayList " + list);

		list.set(1, "Node");
		
		System.out.println("Updated ArrayList : "+list);
		
	}
}
