package com.day8.java;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//  Concurrency questions for 5 YOE focus heavily on asynchronous programming, thread pool management

public class AggregatorService {

	private final ExecutorService executor = Executors.newFixedThreadPool(10);

	public CompletableFuture<String> getUserDashboardData(String userId) {
		CompletableFuture<String> profileFuture = CompletableFuture.supplyAsync(() -> fetchProfile(userId), executor);

		CompletableFuture<String> ordersFuture = CompletableFuture.supplyAsync(() -> fetchOrders(userId), executor)
				.exceptionally(ex -> "Fallback: Empty Order History"); // Graceful error handling

		CompletableFuture<String> pointsFuture = CompletableFuture.supplyAsync(() -> fetchPoints(userId), executor);

		return CompletableFuture.allOf(profileFuture, ordersFuture, pointsFuture).thenApply(v -> {
			String profile = profileFuture.join();
			String orders = ordersFuture.join();
			String points = pointsFuture.join();
			return String.format("Dashboard -> %s | %s | %s", profile, orders, points);
		});
	}

	private String fetchProfile(String id) {
		return "User A";
	}

	private String fetchOrders(String id) {
		throw new RuntimeException("Service Down");
	}

	private String fetchPoints(String id) {
		return "1500 Points";
	}
}