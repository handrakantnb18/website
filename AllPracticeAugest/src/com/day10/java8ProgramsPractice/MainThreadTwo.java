package com.day10.java8ProgramsPractice;

// yThread extends the Thread class.
// run() contains the task performed by the thread.
// Extending Thread

class MyThreadTwo extends Thread {
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
}
public class MainThreadTwo {

	public static void main(String[] args) {
		
		MyThreadTwo tht = new MyThreadTwo();
		tht.start();
	}
}
