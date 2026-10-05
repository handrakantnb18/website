package com.day4.javaProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// To add an element to the list, we can use the add()method

public class ListInterfaceTestTwo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("1. Java");
		list.add("2. Python");
		list.add("3. DSA");
		list.add("4. C++");
		list.add("5. React");
		list.add("6. Node");
		
		System.out.println(list);
		
	}
}
