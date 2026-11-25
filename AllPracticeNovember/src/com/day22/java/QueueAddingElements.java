package com.day22.java;

import java.util.PriorityQueue;
import java.util.Queue;

// To add an element in a queue, we can use the add() method

public class QueueAddingElements {

	public static void main(String[] args) {

		Queue<String> pq = new PriorityQueue<>();

		pq.add("Ram");
		pq.add("Ajit");
		pq.add("Pooja");
		pq.add("Rahul");
		pq.add("Priya");
		pq.add("Pravin");
		pq.add("Samadhan");
		pq.add("Sachin");
		pq.add("Seema");

		System.out.println(pq);

	}
}
