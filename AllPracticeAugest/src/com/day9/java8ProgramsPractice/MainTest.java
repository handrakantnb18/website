package com.day9.java8ProgramsPractice;

abstract class Animal
{
	public abstract void animalSound();
	
	public void sleep()
	{
		System.out.println("ZZZZZZZZZZZZ");
	}
}

class Pig extends Animal 
{
	public void animalSound()
	{
		System.out.println("The pig says: wee wee");
	}
}

public class MainTest {

	public static void main(String[] args) {
		
		Pig pig = new Pig();
		pig.animalSound();
		pig.sleep();
	}
}
