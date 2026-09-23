package com.day22.java8ProgramsPractice;

import java.util.*;

// A queue follows the FIFO (First In First Out) principle
//  Java provides Queue interface and classes like 
// LinkedList or PriorityQueue

public class DSAQueueTestEight {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		queue.add("E");
		queue.add("F");

		System.out.println("Initial queue: " + queue);
		System.out.println("Dequeued: " + queue.remove());
		System.out.println("Queue after dequeue: " + queue);

	}
}
