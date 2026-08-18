package com.day18.java8ProgramsPractice;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {

	public static void main(String[] args) throws Exception {
		
		ExecutorService execute = Executors.newFixedThreadPool(3);
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		Future<Integer> future = execute.submit(() ->{
			return 10 + 20;
		});
		
		Future<Integer> future1 = executor.submit(() -> {
			return 100;
		});
		
		System.out.println("Result : "+future.get());
		
		execute.shutdown();
		
		System.out.println("Result : "+future1.get());
		
		executor.shutdown();
		
		
		
	}
}
