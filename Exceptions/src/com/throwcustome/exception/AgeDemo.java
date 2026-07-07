package com.throwcustome.exception;

import com.allcustome.exceptions.AgeNotValidException;
import java.util.Scanner;

public class AgeDemo {

	void ageCheck()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age : ");
		
		int age = sc.nextInt();
		
				
		if(age < 18)
		{
			throw new AgeNotValidException("Age is not valid..");
		}
		else
		{
			System.out.println("Age is Valid for Voting");
		}
	}

	public static void main(String[] args) {

		AgeDemo demo = new AgeDemo();
		
		demo.ageCheck();
	}
}
