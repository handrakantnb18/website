package com.day31.javaProgramsPractice;

import java.util.Iterator;
import java.util.LinkedList;

// How to Iterate LinkedList in Java

public class LinkedListThree {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();

		linkedList.add(15);
		linkedList.add(10);
		linkedList.add(1);
		linkedList.add(40);
		linkedList.add(71);

		iterateUsingIterator(linkedList);
	}

	public static void iterateUsingIterator(LinkedList<Integer> linkedList) {

		System.out.print("Iterating the LinkedList using Iterator : ");

		Iterator it = linkedList.iterator();
		
		while (it.hasNext()) {

			System.out.print(it.next() + " ");
		}

	}
}
