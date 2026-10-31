package com.day31.javaProgramsPractice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// the ArrayList is passed as the parameter into the LinkedList constructor

public class LinkedListTwo {

	public static <T> List<T> convertALtoLL(List<T> aL) {

		List<T> lL = new LinkedList<>(aL);

		return lL;
	}

	public static void main(String[] args) {

		List<String> aL = 
				Arrays.asList("Chandraakant", "Priyanka", "Shivraj");

		System.out.println("ArrayList: " + aL);

		List<String> lL = convertALtoLL(aL);

		System.out.println("LinkedList: " + lL);

	}
}
