package com.zeroToHero.thread;

// creating a thread by extending the Thread class:
// The run() method contains the code executed by the thread. 
// Calling start() initiates a new thread and executes the run() 
// method concurrently with the main thread.

class MyThreadT extends Thread {
	
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Thread running : "+i);
		}
	}
}

public class ThreadTestLoop {

	public static void main(String[] args) {
		
		MyThreadT tht = new MyThreadT();
		tht.start();
		
	}
}
