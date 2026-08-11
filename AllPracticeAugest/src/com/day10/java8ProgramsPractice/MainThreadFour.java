package com.day10.java8ProgramsPractice;

// Multiple Threads Example
// order may change because the thread scheduler 
// decides which thread gets CPU time.
class MyTaskTwo implements Runnable{
	
	public void run() {
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.println(
					Thread.currentThread().getName()
					+" : "+i
					);
		}
	}
}

public class MainThreadFour {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyTaskTwo(), " Thread- 1");
		Thread t2 = new Thread(new MyTaskTwo(), " Thread- 2");
		
		t1.start();
		t2.start();
		
	}
}
