package com.day10.javaProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// Searching in a List can be done using indexOf(), lastIndexOf() methods

public class SetInterfaceTestFour {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);

		int i = list.indexOf(2);

		System.out.println("First Occurrence of 2 is at Index: " + i);

		int l = list.lastIndexOf(2);

		System.out.println("Last Occurrence of 2 is at Index: " + l);

	}
}
