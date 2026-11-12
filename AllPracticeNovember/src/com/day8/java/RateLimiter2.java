package com.day8.java;

// Write a Java program to implement a Rate Limiter using a Semaphor

import java.util.concurrent.Semaphore;

public class RateLimiter2 {

	private final Semaphore semaphore;

    public RateLimiter2(int permits) {
        semaphore = new Semaphore(permits);
    }

    public boolean allowRequest() {
        return semaphore.tryAcquire();
    }

    public void releaseRequest() {
        semaphore.release();
    }
    
}
