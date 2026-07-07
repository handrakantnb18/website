package com.throwcustome.exception;

import com.allcustome.exceptions.InsufficentBalanceException;
import java.util.Scanner;

public class InsufficentBalance {

	void balanceCheck()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter amount");
		
		int balance = scr.nextInt();
		
		if(balance < 0)
		{
			throw new InsufficentBalanceException("Insufficent Balance");
		}
		else
		{
			System.out.println("Balance is available");
		}
	}
	
	public static void main(String[] args) {
		
		InsufficentBalance ifb = new InsufficentBalance();
		
		try
		{
		  ifb.balanceCheck();
		}
		catch(InsufficentBalanceException i)
		{
			System.out.println(i.getMessage());
		}
	}
}
