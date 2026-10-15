package com.day15.javaProgramsPractice;

import java.util.LinkedList;
import java.util.Queue;

// how Queue follows FIFO order

public class CollectionTestSeven {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

		queue.add("Rahul");
		queue.add("Priya");
		queue.add("Amit");

		System.out.println(queue.poll());

	}
}
