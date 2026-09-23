package com.day23.java8ProgramsPractice;

import java.util.PriorityQueue;

// A Heap is a special tree-based structure that 
// satisfies the heap property (Min-Heap or Max-Heap)

public class DSAHeapTestTwelve {

	public static void main(String[] args) {

		PriorityQueue<Integer> heap = new PriorityQueue<>();
		heap.add(5);
		heap.add(7);
		heap.add(9);
		heap.add(1);

		System.out.println("Heap: " + heap);
		System.out.println("Smallest element: " + heap.poll());
		System.out.println("Heap after poll: " + heap);

	}
}
