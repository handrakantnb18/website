package com.day5.java;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

// Enhanced Random Generators

public class RandomGeneratorDemo {

	public static void generateRandomNumbers() {
		
        RandomGenerator random = RandomGeneratorFactory.of("L128X256MixRandom").create();
        
        System.out.println("Random Double: " + random.nextDouble());
        System.out.println("Random Int: " + random.nextInt(100));
    }
	
	public static void main(String[] args) {
		
		generateRandomNumbers();
		
	}
}
