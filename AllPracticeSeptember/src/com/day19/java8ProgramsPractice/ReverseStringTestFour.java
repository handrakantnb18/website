package com.day19.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

// The Collections.reverse() method can be used when dealing with lists. 
// We can convert a string to a list of characters, reverse it, and print it back.

public class ReverseStringTestFour {

	public static void main(String[] args) {

		String str = "chandrakantbhosale";

		char[] arr = str.toCharArray();

		List<Character> list = new ArrayList<Character>();

		for (char c : arr)
			list.add(c);

		Collections.reverse(list);

		ListIterator itr = list.listIterator();

		while (itr.hasNext())
			System.out.print(itr.next());

	}
}
