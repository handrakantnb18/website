package com.day28.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTestTwo {

	public static void main(String[] args) {
		
		// Adding elements to object of List interface
		List<String> list = new ArrayList<String>();
		list.add("Amit");
		list.add("Rahul");
		list.add("Ram");
		list.add("Pooja");
		
		// Accessing elements using get() method
		String first = list.get(0);
		String second = list.get(1);
		String third = list.get(2);
		String four = list.get(3);
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(four);
		System.out.println(list);
		
		//  Checking if an element is present or not
		// true
		boolean isPresent = list.contains("Ram");
		System.out.println("Is Ram is present : "+isPresent);
		
		// false
		boolean isPresent1 = list.contains("Ram1");
		System.out.println("Is Ram is present : "+isPresent1);
		
		// Using for-each loop for iteration
		System.out.println("---------------------");
		for (String str : list)
			System.out.println(str);
		
	}
}
