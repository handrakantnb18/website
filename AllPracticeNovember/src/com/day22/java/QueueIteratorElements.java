package com.day22.java;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

// There are multiple ways to iterate through the Queue

public class QueueIteratorElements {

	public static void main(String[] args) {

		Queue<String> pq = new PriorityQueue<>();

		pq.add("1. Seema");
		pq.add("2. Ram");
		pq.add("3. Rahul");
		pq.add("4. Priya");
		pq.add("5. Pravin");
		pq.add("6. Samadhan");

		Iterator<String> iterator = pq.iterator();

		while (iterator.hasNext()) {
			
			System.out.print(iterator.next() + " ");
		}

	}
}
