package com.day22.java;

import java.util.PriorityQueue;
import java.util.Queue;

// remove() throws a NoSuchElementException if the queue is empty

public class QueueRemovingElements {

	public static void main(String[] args) {

		Queue<String> pq = new PriorityQueue<>();

		pq.add("Rahul");
		pq.add("Priya");
		pq.add("Pravin");
		pq.add("Samadhan");
		pq.add("Sachin");
		pq.add("Seema");
		pq.add("Ram");
		pq.add("Ajit");
		pq.add("Pooja");

		System.out.println("Initial Queue: " + pq);

		pq.remove("Pooja");

		System.out.println("After Remove: " + pq);

		System.out.println("Poll Method: " + pq.poll());

		System.out.println("Final Queue: " + pq);

	}
}
