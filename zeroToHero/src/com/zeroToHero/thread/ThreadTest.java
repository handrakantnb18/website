package com.zeroToHero.thread;

// can create a thread by extending the Thread class 
// and overriding its run() method.

class MyThread extends Thread{
	
	public void run() {
		System.out.println("Thread run method..");
	}
}
public class ThreadTest {

	public static void main(String[] args) {
		
		MyThread th = new MyThread();
		th.run();
		
	}
}
