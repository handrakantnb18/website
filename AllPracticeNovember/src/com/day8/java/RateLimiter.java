package com.day8.java;

// Write a Java program to implement a Rate Limiter using a Semaphore

import java.util.concurrent.Semaphore;

public class RateLimiter {

	private final Semaphore semaphore;

	public RateLimiter(int permits) {
		semaphore = new Semaphore(permits);
	}

	public boolean allowRequest() {
		return semaphore.tryAcquire();
	}

	public void releaseRequest() {
		semaphore.release();
	}

}
