package com.day9.java8ProgramsPractice;

class Animal2
{
	public void makeSound()
	{
		System.out.println("Animal Sound barking...");
	}
}
public class MainAnonyms {

	public static void main(String[] args) {
		
		Animal2 animal = new Animal2()
				{
					public void makeSound()
					{
						System.out.println("Woof Woof Woof...");
					}
				};
				
				animal.makeSound();
	}
}
