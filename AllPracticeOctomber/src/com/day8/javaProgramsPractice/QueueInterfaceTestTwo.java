package com.day8.javaProgramsPractice;

import java.util.PriorityQueue;
import java.util.Queue;

// To add an element in a queue, we can use the add() method

public class QueueInterfaceTestTwo {

	public static void main(String[] args) {

		Queue<String> pq = new PriorityQueue<>();

		pq.add("Chandrakant");
		pq.add("Namdev");
		pq.add("Bhosale");
		pq.add("Priyanka");
		pq.add("Keshav");
		pq.add("Shivraj");

		System.out.println(pq);

	}
}
