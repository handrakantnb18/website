package com.day4.javaProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// The List interface in Java extends the Collection interface

public class ListInterfaceTestOne {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("1. Java");
		list.add("2. Python");
		list.add("3. DSA");
		list.add("4. C++");
		list.add("5. React");
		list.add("6. Node");

		System.out.println("Elements of List are:");

		for (String s : list) {
			System.out.println(s);
		}

	}
}
