package com.throwcustome.exception;

import com.allcustome.exceptions.ProductNotFoundException;
import java.util.Scanner;

public class ProductDemo {

	
	void productFound()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter product : ");
		
		String name1 = scr.next("abc");
		
//		if(name1 < abc)
//		{
//			throw new ProductNotFoundException("Product Not found");
//		}
//		else
//		{
//			System.out.println("Product Found");
//		}
	}
	public static void main(String[] args) {
		
		ProductDemo pd = new ProductDemo();
		
		try
		{
			pd.productFound();
		}
		catch(ProductNotFoundException p)
		{
			System.out.println(p.getMessage());
		}
		
	}
}
