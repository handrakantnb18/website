package com.day15.javaProgramsPractice;

import java.util.ArrayDeque;
import java.util.Deque;

// a Deque is created using ArrayDeque, elements are added,

public class CollectionTestTen {

	public static void main(String[] args) {

		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Lucy");
		deque.add("Andrew");
		deque.add("Henery");

		deque.add("Rahul");
		deque.add("Priya");
		deque.add("Amit");

		deque.add("Ram");
		deque.add("Pooja");
		deque.add("Anil");

		deque.add("Lucy");
		deque.add("Peter");
		deque.add("Lucy");
		deque.add("John");

		for (String str : deque) {
			System.out.println(str);
		}

	}
}
