package com.day21.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collection;

//  add elements using the add(E e) method for a single element or addAll

public class InterfaceTestTwo {

	public static void main(String[] args) {

		Collection<Integer> numbers = new ArrayList<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);

		Collection<Integer> moreNumbers = new ArrayList<>();
		moreNumbers.add(40);
		moreNumbers.add(50);

		numbers.addAll(moreNumbers);

		System.out.println("After adding elements: " + numbers);

	}
}
