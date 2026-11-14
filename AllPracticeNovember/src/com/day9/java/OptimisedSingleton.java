package com.day9.java;

// Thread-Safe Singleton with Modern Java Mechanics

public class OptimisedSingleton {

	private OptimisedSingleton() {

		if (InstanceHolder.INSTANCE != null) {

			throw new IllegalStateException("Already instantiated");
		}
	}

	private static class InstanceHolder {

		private static final OptimisedSingleton INSTANCE = new OptimisedSingleton();
	}

	public static OptimisedSingleton getInstance() {
		return InstanceHolder.INSTANCE;
	}

}
