package com.day8.java;

// Write a Java program using CompletableFuture for asynchronous execution

import java.util.concurrent.CompletableFuture;

public class AsyncExample2 {

	public static void main(String[] args) {

		CompletableFuture<String> future = 
				CompletableFuture.supplyAsync(() -> "Processing Data");

		future.thenAccept(System.out::println);

		future.join();

	}
}
