package com.day10.java8ProgramsPractice;

// Implementing Runnable
// This is generally preferred because Java 
// supports single inheritance.

class MyTask implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Task is running...");
	}
}

public class MainThreadThree {

	public static void main(String[] args) {
		
		MyTask mt = new MyTask();
		
		Thread t1 = new Thread();
		
		t1.start();
	}
}
