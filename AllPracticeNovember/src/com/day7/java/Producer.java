package com.day7.java;

import java.util.*;

// Write a Java program to implement the Producer-Consumer problem using the wait and notify methods

class ProducerConsumer {
	private final Queue<Integer> queue = new LinkedList<>();
	private final int LIMIT = 10;

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {
				while (queue.size() == LIMIT) {
					wait();
				}
				queue.add(value++);
				System.out.println("Produced " + value);
				notify();
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (queue.isEmpty()) {
					wait();
				}
				int value = queue.poll();
				System.out.println("Consumed " + value);
				notify();
			}
		}
	}
}

public class Producer {

	public static void main(String[] args) {

		ProducerConsumer pc = new ProducerConsumer();
		Thread producer = new Thread(() -> {
			try {
				pc.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread consumer = new Thread(() -> {
			try {
				pc.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		producer.start();
		consumer.start();

	}
}
