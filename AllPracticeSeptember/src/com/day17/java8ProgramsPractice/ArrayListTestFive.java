package com.day17.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// To access an element in the list, we can use the get()
// method, which returns the element at the specified index.

public class ArrayListTestFive {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("1. Java");
		list.add("2. Python");
		list.add("3. DSA");
		list.add(1, "4. C++");
		
		String first = list.get(0);
        String second = list.get(1);
        String third = list.get(2);
        String four = list.get(3);
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(four);
        
	}
}
