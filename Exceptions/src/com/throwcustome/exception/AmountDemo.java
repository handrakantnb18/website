package com.throwcustome.exception;

import com.allcustome.exceptions.AmountNotValidException;
import java.util.Scanner;

public class AmountDemo {

	void amountCheck()
	{
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter Amount : ");
		
		int amount = sca.nextInt();
		
		if(amount < 25000)
		{
			throw new AmountNotValidException("Amount not Valid");
		}
		else
		{
			System.out.println("Amount is valid in Acount.");
		}
	}
	
	public static void main(String[] args) {
		
		AmountDemo amountd = new AmountDemo();
		
		amountd.amountCheck();
		
		
	}
}
