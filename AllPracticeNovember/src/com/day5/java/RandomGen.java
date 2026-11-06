package com.day5.java;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

// The new Random Number Generators API in Java 17

public class RandomGen {

	public static void main(String[] args) {
		
		RandomGenerator rng = RandomGeneratorFactory.of("Xoshiro256PlusPlus")
	             .create();
	        int randomInt = rng.nextInt();
	        rng.doubles().limit(5).forEach(System.out::println);
	 
	        RandomGenerator splitRng = RandomGeneratorFactory.of("L64X128MixRandom").create();
	       
//	        RandomGenerator split1 = splitRng.split();
//	        RandomGenerator split2 = splitRng.split();
//	 
//	        System.out.println(split1.nextInt());
//	        System.out.println(split2.nextInt());
//	        
	}
}
