package com.throwcustome.exception;

import com.allcustome.exceptions.UserNotFoundException;
import java.util.Scanner;

public class UserNotFound {

	void userNotFount()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter User name");
		
		String name = scr.next("chandrakant");
		
		if(String n : name)
		{
			throw new UserNotFoundException("USer Not Found");
		}
		else
		{
			System.out.println("User Found");
		}
	}
	
	public static void main(String[] args) {
		
		UserNotFound unf = new UserNotFound();
		
		unf.userNotFount();
		
		
	}
}
