package com.day22.java;

import java.util.PriorityQueue;
import java.util.Queue;

// We can access the head element without removing it using peek() or element()

public class QueueAccessingElements {

	public static void main(String[] args) {

		Queue<String> pq = new PriorityQueue<>();

		pq.add("Rahul");
		pq.add("Priya");
		pq.add("Pravin");
		pq.add("Samadhan");
		pq.add("Sachin");
		pq.add("Seema");
		pq.add("Ram");

		System.out.println("Head using peek(): " + pq.peek());
		
		System.out.println("Head using element(): " + pq.element());

		System.out.println("Queue after accessing head: " + pq);

	}
}
