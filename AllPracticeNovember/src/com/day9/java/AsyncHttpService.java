package com.day9.java;

//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.util.concurrent.CompletableFuture;

// Java 11 HttpClient & Async Data Fetching


public class AsyncHttpService {

//	private final HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2) // Native HTTP/2
//																										// support
//			.build();
//
//	public void fetchDataAsync(String url) {
//		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
//
//		CompletableFuture<HttpResponse<String>> responseFuture = httpClient.sendAsync(request,
//				HttpResponse.BodyHandlers.ofString());
//
//		responseFuture.thenApply(HttpResponse::body).thenAccept(System.out::println).join(); // Blocks only for
//																								// demonstration
//																								// purposes
//	}

}
