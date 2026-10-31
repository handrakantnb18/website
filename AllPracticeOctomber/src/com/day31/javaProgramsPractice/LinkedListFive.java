package com.day31.javaProgramsPractice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// which can be used to create a LinkedList from another collection using Collection.addAll() method.

public class LinkedListFive {

	public static <T> List<T> convertALtoLL(List<T> aL) {

		List<T> lL = new LinkedList<>();

		lL.addAll(aL);

		return lL;
	}

	public static void main(String[] args) {

		List<String> aL = 
				Arrays.asList("Keshav", "Priyanka", "Shivraj");

		System.out.println("ArrayList: " + aL);

		List<String> lL = convertALtoLL(aL);

		System.out.println("LinkedList: " + lL);

	}
}
