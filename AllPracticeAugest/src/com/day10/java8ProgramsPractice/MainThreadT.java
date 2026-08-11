package com.day10.java8ProgramsPractice;

// start() creates a new thread and internally invokes run().
// Multithreading is a Java feature that allows multiple  
// threads to execute concurrently within a single process

class MyThread extends Thread {
	
	@Override 
	public void run() {
		System.out.println("Thread is running..");
	}
}

public class MainThreadT {

	public static void main(String[] args) {
		
		MyThread th = new MyThread();
		th.start();
	}
}
