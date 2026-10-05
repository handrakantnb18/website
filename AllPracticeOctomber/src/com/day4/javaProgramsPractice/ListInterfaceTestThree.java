package com.day4.javaProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// To update an element in a list, use the set() 
// method with the target index and the new value

public class ListInterfaceTestThree {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("1. Java");
		list.add("2. Python");
		list.add("3. DSA");
		list.add("4. C++");
		list.add("5. React");
		list.add("6. Node");
		
		System.out.println("Initial ArrayList : "+list);
		
		list.set(1, "2. Angular");
		
		System.out.println("Updated ArrayList : "+list);
		
	}
}
