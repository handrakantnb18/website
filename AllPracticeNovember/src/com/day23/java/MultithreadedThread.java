package com.day23.java;

// Creation and execution of a thread via start() and run() method in Single inheritance

class MyThread1 extends Thread {

	public void run() {
		System.out.println("Thread1 is running");
	}
}

class MyThread2 extends Thread {

	public void run() {
		System.out.println("Thread2 is running");
	}
}

public class MultithreadedThread {

	public static void main(String[] args) {

		MyThread1 obj1 = new MyThread1();
		MyThread2 obj2 = new MyThread2();
		obj1.start();
		obj2.start();

	}
}
