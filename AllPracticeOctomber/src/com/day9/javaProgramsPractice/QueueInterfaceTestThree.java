package com.day9.javaProgramsPractice;

import java.util.PriorityQueue;
import java.util.Queue;

//The Queue interface provides remove() and poll() to retrieve and remove the head of the queue

public class QueueInterfaceTestThree {

	public static void main(String[] args) {
		
		Queue<String> pq = new PriorityQueue<>();

		pq.add("Chandrakant");
		pq.add("Namdev");
		pq.add("Bhosale");
		pq.add("Priyanka");
		pq.add("Keshav");
		pq.add("Shivraj");

		System.out.println("Initial Queue: " + pq);

		pq.remove("Namdev");

		System.out.println("After Remove: " + pq);

		System.out.println("Poll Method: " + pq.poll());

		System.out.println("Final Queue: " + pq);
		
	}
}
