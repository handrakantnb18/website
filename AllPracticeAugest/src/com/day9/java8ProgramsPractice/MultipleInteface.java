package com.day9.java8ProgramsPractice;

interface FirstInterface
{
	public void myMethod();
}

interface SecondInterface
{
	public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface
{
	public void myMethod()
	{
		System.out.println("1)= abstract classes, interfaces "
				+ "cannot be used to create objects");
	}
	public void myOtherMethod()
	{
		System.out.println("2)= Interface methods do not have a body "
				+ "- the body is provided by the \"implement\" class");
	}
}

public class MultipleInteface {

	public static void main(String[] args) {
		
		DemoClass obj = new DemoClass();
		obj.myMethod();
		obj.myOtherMethod();
		
	}
}
