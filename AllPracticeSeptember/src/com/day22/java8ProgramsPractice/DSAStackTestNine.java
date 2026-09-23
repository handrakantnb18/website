package com.day22.java8ProgramsPractice;

import java.util.ArrayDeque;

// A stack follows the LIFO (Last In First Out) principle
// use the Stack class, but note that it is considered legacy
// synchronized and thread-safe

public class DSAStackTestNine {

	public static void main(String[] args) {

		ArrayDeque<String> deq = new ArrayDeque<>();
		deq.push("A");
		deq.push("B");
		deq.push("C");
		deq.push("D");
		deq.push("E");
		deq.push("F");
		deq.push("G");
		deq.push("G");
		deq.push("I");

		System.out.println("Initial ArrayDeque Stack: " + deq);
		System.out.println("Popped from ArrayDeque: " + deq.pop());
		System.out.println("ArrayDeque Stack after pop: " + deq);

	}
}
