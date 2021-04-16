package com.exception;

import java.util.Scanner;

public class Throww {
	static void invoke()
	{
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.println("Enter the string");
		s1 = sc.next();
		System.out.println(s1);
		
		if(s1.equals("null"))
		{
	
			try
			{
				throw new NullPointerException();
			}catch(NullPointerException e)
			{
				System.out.println("String is null");
			}
			
		}
		else if(s1.equals("Java"))
		{
			System.out.println("Welcome "+s1);
		}
		else
		{
			System.out.println("Hai "+s1);
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		invoke();
	}
	

}
