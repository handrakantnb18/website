package com.day31.javaProgramsPractice;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//  How to Make a Collection Read-Only in Java

public class CollectionTestTwo {

	public static void main(String[] args) {

		Set<Integer> numbers = new HashSet<Integer>();

		for (int i = 1; i <= 5; i++) {
			numbers.add(i);
		}

		numbers.stream().forEach(System.out::print);
		numbers.remove(5);

		System.out.println("\nAfter Performing Operation");
		
		numbers.stream().forEach(System.out::print);
		System.out.println("\nSet is also By Default Readable and Writable");

		try {
			numbers = Collections.unmodifiableSet(numbers);

			numbers.remove(4);
		} 
		catch (UnsupportedOperationException unsupportedOperationException) {
			
			System.out.println("Exceptions is " + unsupportedOperationException);
		} 
		finally {
			
			System.out.println(numbers.contains(3));
			System.out.println("Now Set is Read-Only");
		}
	}
}
