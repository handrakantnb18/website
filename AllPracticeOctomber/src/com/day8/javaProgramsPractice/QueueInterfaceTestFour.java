package com.day8.javaProgramsPractice;

import java.util.PriorityQueue;
import java.util.Queue;

// access the head element without removing it using peek() or element()

public class QueueInterfaceTestFour {

	public static void main(String[] args) {

		Queue<String> pq = new PriorityQueue<>();

		pq.add("Chandrakant");
		pq.add("Namdev");
		pq.add("Bhosale");
		pq.add("Priyanka");
		pq.add("Keshav");
		pq.add("Shivraj");

		System.out.println("Head using peek(): " + pq.peek());
		System.out.println("Head using element(): " + pq.element());

		System.out.println("Queue after accessing head: " + pq);

	}
}
