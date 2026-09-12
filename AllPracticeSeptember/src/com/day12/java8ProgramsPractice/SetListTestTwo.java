package com.day12.java8ProgramsPractice;

import java.util.HashSet;
import java.util.Set;

// To add elements to a Set in Java, use the add() method.

public class SetListTestTwo {

	public static void main(String[] args) {
		
		Set<String> list = new HashSet<String>();
		list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        list.add("D");
        list.add("P");
        list.add("S");
        list.add("P");
        
        System.out.println(list);
	}
}
