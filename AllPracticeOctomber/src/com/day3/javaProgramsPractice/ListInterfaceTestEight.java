package com.day3.javaProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// Adding element at specified position inside list object

public class ListInterfaceTestEight {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("1. Java");
		list.add("2. Python");
		list.add("3. DSA");
		list.add("4. C++");
		list.add("5. React");
		list.add("6. Node");

		list.add(1, "2. AWS");

		for (int i = 0; i < list.size(); i++) {

			System.out.print(list.get(i) + " ");
		}

		System.out.println();

		for (String str : list)

			System.out.print(str + " ");
	}
}
