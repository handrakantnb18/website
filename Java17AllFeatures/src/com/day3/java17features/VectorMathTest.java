package com.day3.java17features;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class VectorMathTest {

	public static void main(String[] args) {
		
		RandomGenerator random = RandomGeneratorFactory.getDefault().create();
		
		int randomInt = random.nextInt();
		System.out.println("Randon integer : "+randomInt);
		
		double randomDouble = random.nextDouble();
		System.out.println("Random Double : "+randomDouble);
		
		random.ints(5).forEach(System.out::println);
		
		RandomGenerator ran = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create();
		
		System.out.println("Xoshiro256PlusPlus : "+ran.nextInt());
	}
}
