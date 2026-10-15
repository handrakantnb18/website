package com.day15.javaProgramsPractice;

import java.util.Iterator;
import java.util.Stack;

// Stack is used to store elements, one element is removed using pop(),

public class CollectionTestSix {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.push("CPU");
		stack.push("Monitor");
		stack.push("Mouse");
		stack.push("Keyboard");
		stack.push("Printer");
		stack.pop();
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
