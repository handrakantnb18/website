package com.day3.javaProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// To access an element in the list, we can use the get() method

public class ListInterfaceTestSix {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("1. Java");
		list.add("2. Python");
		list.add("3. DSA");
		list.add("4. C++");
		list.add("5. React");
		list.add("6. Node");
		
		System.out.println("Initial elements : "+list);
		
		String first = list.get(0);
		String second = list.get(1);
		String third = list.get(2);
		String four = list.get(3);
		String five = list.get(4);
		String six = list.get(5);

		System.out.println("After get elements : ");
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);

	}
}
