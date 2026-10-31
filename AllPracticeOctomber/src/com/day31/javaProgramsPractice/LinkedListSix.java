package com.day31.javaProgramsPractice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

// TreeMap is of the different type than the HashMap

public class LinkedListSix {

	public static <T> List<String> convertALtoLL(List<T> aL) {

		return aL.stream().map(String::valueOf).collect(Collectors.toCollection(LinkedList::new));
	}

	public static void main(String[] args) {

		List<Integer> aL = Arrays.asList(1, 2, 3, 4, 5);

		System.out.println("ArrayList: " + aL);

		List<String> lL = convertALtoLL(aL);

		System.out.println("LinkedList: " + lL);

	}
}
