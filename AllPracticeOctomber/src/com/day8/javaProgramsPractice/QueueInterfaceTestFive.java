package com.day8.javaProgramsPractice;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

// The most famous way is converting the queue to the 
// array and traversing using the for loop

public class QueueInterfaceTestFive {

	public static void main(String[] args) {

		Queue<String> pq = new PriorityQueue<>();

		pq.add("Chandrakant");
		pq.add("Namdev");
		pq.add("Bhosale");
		pq.add("Priyanka");
		pq.add("Keshav");
		pq.add("Shivraj");

		Iterator<String> iterator = pq.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
