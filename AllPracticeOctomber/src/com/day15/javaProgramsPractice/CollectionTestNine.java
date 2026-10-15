package com.day15.javaProgramsPractice;

import java.util.ArrayDeque;
import java.util.Deque;

// Deque interface extends the Queue interface

public class CollectionTestNine {

	public static void main(String[] args) {

		Deque<String> deque = new ArrayDeque<>();

		deque.addFirst("Rahul");
		deque.addLast("Priya");

		System.out.println(deque);

	}
}
