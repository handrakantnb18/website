package com.day5.javaProgramsPractice;

import java.util.HashSet;
import java.util.Set;

// various ways to iterate through the Set. The most 
// famous one is to use the enhanced for loop

public class SetInterfaceTestFour {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("A");
		set.add("D");
		set.add("B");
		set.add("E");
		set.add("F");
		
		for ( String value : set)
			System.out.println(value+", ");
		
		System.out.println();
	}
}
