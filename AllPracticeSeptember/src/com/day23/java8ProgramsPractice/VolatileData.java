package com.day23.java8ProgramsPractice;

// The run() method in VolatileThread.java reads
// the counter value before and after updating it. 
// In the main class

public class VolatileData {

	private volatile int counter = 0;

	public int getCounter() {
		return counter;
	}

	public void increaseCounter() {
		++counter;
	}

}
