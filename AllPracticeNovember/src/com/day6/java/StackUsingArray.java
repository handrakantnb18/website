package com.day6.java;

// Write a Java program to implement a stack using an array

public class StackUsingArray {

	private int[] stack;
	private int top;

	public StackUsingArray(int capacity) {
		stack = new int[capacity];
		top = -1;
	}

	public void push(int value) {
		if (top == stack.length - 1)
			System.out.println("Stack overflow");
		else
			stack[++top] = value;
	}

	public int pop() {
		if (top == -1) {
			System.out.println("Stack underflow");
			return -1;
		}
		return stack[top--];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public static void main(String[] args) {
		
		 StackUsingArray stack = new StackUsingArray(5);
	        stack.push(10);
	        stack.push(20);
	        stack.pop();
	        
	        System.out.println("Stack is empty: " + stack.isEmpty());
	        
	}
}
