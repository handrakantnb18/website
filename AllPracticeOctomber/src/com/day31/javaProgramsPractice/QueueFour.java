package com.day31.javaProgramsPractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// How to Iterate over a Queue in Java

public class QueueFour {

	public static void main(String[] args) {

		Queue<Integer> studentQueue = new LinkedList<>();

		studentQueue.add(1);
		studentQueue.add(3);
		studentQueue.add(8);
		studentQueue.add(14);
		studentQueue.add(9);
		studentQueue.add(3);

		Iterator<Integer> studentQueueIterator = studentQueue.iterator();

		while (studentQueueIterator.hasNext()) {
			Integer name = studentQueueIterator.next();
			System.out.print(name + " ");
		}

	}
}
