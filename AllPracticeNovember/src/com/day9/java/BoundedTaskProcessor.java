package com.day9.java;

import java.util.concurrent.*;

// Advanced Concurrency: Custom Thread Pool Processing

public class BoundedTaskProcessor {

	public void processPatternTasks(int threads, int maxQueueCapacity) {
		
		BlockingQueue<Runnable> queue = 
				new LinkedBlockingQueue<>(maxQueueCapacity);

		ThreadPoolExecutor executor = 
				new ThreadPoolExecutor
				(threads, threads, 0L, 
						TimeUnit.MILLISECONDS, queue,
				new ThreadPoolExecutor
				.CallerRunsPolicy() 
		);

		executor.shutdown();
	}
}
