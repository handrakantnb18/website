package com.day23.java;

// volatile guarantees visibility i.e. any write to a volatile variable is immediately visible to other threads

class Counter2 {
	private volatile boolean running = true;

	public void stop() {
		running = false;
	}

	public void start() {
		
		new Thread(() -> {
			while (running) {
				System.out.println("Running...");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			System.out.println("Stopped.");
		}).start();
	}
}

public class VolatileModifire {

	public static void main(String[] args) throws InterruptedException {
		Counter2 counter = new Counter2();
		counter.start();

		Thread.sleep(600);
		counter.stop();

	}
}
