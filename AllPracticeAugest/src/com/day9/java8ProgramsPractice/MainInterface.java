package com.day9.java8ProgramsPractice;

interface Animal1
{
	public void animalSound();
	
	public void sleep();
}

class Pig1 implements Animal1
{
	public void animalSound()
	{
		System.out.println("The pig says: Kay pan bolta");
	}
	
	public void sleep()
	{
		System.out.println("Zzzzzzzzz");
	}
}

public class MainInterface {

	public static void main(String[] args) {
		
		Pig1 pig = new Pig1();
		pig.animalSound();
		pig.sleep();
	}
}
