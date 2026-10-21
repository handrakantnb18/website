package com.day21.javaProgramsPractice;

import java.util.*;

// Allows adding, removing, and replacing elements during iteration

public class InterfaceTestSix {

	public static void main(String[] args) {

		List<String> colors = new ArrayList<>
		(Arrays.asList("Red", "Green", "Blue"));

		ListIterator<String> listIt = 
				colors.listIterator();

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
