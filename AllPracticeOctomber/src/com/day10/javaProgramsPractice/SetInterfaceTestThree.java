package com.day10.javaProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// To update an element in a list, use the set() method with the target index and the new value

public class SetInterfaceTestThree {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("1. Java");
		list.add("2. Python");
		list.add("3. DSA");
		list.add("4. C++");
		list.add("5. Node");
		list.add("6. React");
		list.add("7. Spring");
		list.add("8. Angular");

		System.out.println("Initial ArrayList : " + list);

		list.set(2, "3. Hibernate");

		System.out.println("Updated ArrayList " + list);

	}
}
