package com.zeroToHero.thread;
// the Runnable interface and providing an implementation for the run() method
// You then pass the Runnable object to a Thread object and call start().

class MyRunnable implements Runnable {
	
	public void run() {
		System.out.println("Runnable inteface to implements the run and start method");
		
	}
}

public class TestRunnableDemo {

	public static void main(String[] args) {
		
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
	}
}
