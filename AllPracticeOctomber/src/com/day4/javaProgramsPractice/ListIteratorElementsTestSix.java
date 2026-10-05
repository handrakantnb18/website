package com.day4.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

// ListIterator extends Iterator and is available for List implementations

public class ListIteratorElementsTestSix {

	public static void main(String[] args) {

		List<String> colors = new ArrayList<>(
				Arrays.asList("Red", "Green", "Blue"));

		ListIterator<String> listIt = colors.listIterator();

		System.out.print("Forward: ");
		while (listIt.hasNext()) {
			System.out.print(listIt.next() + " ");
		}

		System.out.print("\nBackward: ");
		while (listIt.hasPrevious()) {
			System.out.print(listIt.previous() + " ");
		}
	}
}
