package com.zeroToHero.thread;
//creating a thread by implementing Runnable:
// implementing Runnable, the thread’s task is defined in the run() method,


class MyRunnableTest implements Runnable {
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Runnable thread : "+i);
		}
	}
}

public class TestRunnableDemoLoop {

	public static void main(String[] args) {
		
		MyRunnableTest tr = new MyRunnableTest();
		Thread t1 = new Thread(tr);
		t1.start();
		
	}
}
