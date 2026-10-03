package com.day2.javaProgramsPractice;

import java.util.HashSet;
import java.util.Set;

//There are various ways to iterate through the Set. The most famous one is to use the enhanced for loop.

public class SetListTestFive {

	public static void main(String[] args) {
		
		Set<String> list = new HashSet<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("B");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("H");
		list.add("I");
		list.add("J");
		list.add("K");
		
		for (String str : list)
			System.out.println(str);
		
		System.out.println();
	}
}
