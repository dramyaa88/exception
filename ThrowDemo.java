package com.exception;
import java.util.*;

public class ThrowDemo {
	
	
	static void invoke() throws NullPointerException
	{
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.println("Enter the string");
		s1 = sc.next();
		System.out.println(s1);
		
		if(s1.equals("null"))
		{
			
				throw new NullPointerException();
			
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
		try
		{
			invoke();
		}catch(NullPointerException e)
		{
			System.out.println("String is null");
		}
	}

}
