package com.day3.javaProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// To remove an element from a list, we can use the remove() method.

public class ListInterfaceTestFive {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("1. Java");
		list.add("2. Python");
		list.add("3. DSA");
		list.add("4. C++");
		list.add("5. React");
		list.add("6. Node");
		
		System.out.println("Initial ArrayList : "+list);
		
		list.remove(1);
		
		System.out.println("After the Index Removal : "+list);
		
		list.remove("3. DSA");
		
		System.out.println("After the Object Removal : "+list);
	}
}
