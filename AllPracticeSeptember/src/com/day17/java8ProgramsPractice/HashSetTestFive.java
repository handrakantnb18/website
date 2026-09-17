package com.day17.java8ProgramsPractice;

import java.util.HashSet;
import java.util.Set;

// There are various ways to iterate through the Set. 
//The most famous one is to use the enhanced for loop

public class HashSetTestFive {

	public static void main(String[] args) {
		
		Set<String> str = new HashSet<String>();
		str.add("B");
		str.add("B");
		str.add("C");
		str.add("A");
		str.add("D");
		str.add("E");
		str.add("F");
		str.add("A");
		
		for (String value : str)
			System.out.print(value +", ");
		
		System.out.println();
		
	}
}
