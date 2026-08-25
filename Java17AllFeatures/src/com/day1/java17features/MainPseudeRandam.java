package com.day1.java17features;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class MainPseudeRandam {

	public static void main(String[] args) {
		
		RandomGeneratorFactory<RandomGenerator> factory =
				RandomGeneratorFactory.of("L64X128MixRandom");
		
		RandomGenerator rng = factory.create(42L);
		
		System.out.println("Alg : "+factory.name());
		System.out.println(rng.nextInt());
		System.out.println(rng.nextDouble());
		System.out.println(rng.ints(5,8,10).boxed().toList());
	}
}
