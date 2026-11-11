package com.day8.java;

import java.util.concurrent.CompletableFuture;

// Write a Java program using CompletableFuture for asynchronous execution

public class AsyncExample {

	public static void main(String[] args) {

		CompletableFuture<String> future = 
				CompletableFuture.supplyAsync(() -> "Processing Data");

		future.thenAccept(System.out::println);

		future.join();

	}
}
