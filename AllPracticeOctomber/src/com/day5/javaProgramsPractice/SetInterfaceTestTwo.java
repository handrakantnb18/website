package com.day5.javaProgramsPractice;

import java.util.HashSet;
import java.util.Set;

// After adding the elements, if we wish to access the 
// elements, we can use inbuilt methods like contains().

public class SetInterfaceTestTwo {

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

		System.out.println("Set is : " + set);

		String s = "G";

		System.out.println("Contains " + s + " " + set.contains(s));

	}
}
