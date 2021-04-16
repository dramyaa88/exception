package com.exception;

public class Hierarchy {
	
	static void divide() throws ArithmeticException,NullPointerException
	{
		int res = 100/0;
		
		char c = "".charAt(1);
	}
	
	public static void main(String[] args) {
		try
		{
			divide();
		}catch(ArithmeticException e)
		{
			System.out.println("Divide by zero");
		}catch(NullPointerException ee)
		{
			System.out.println("String is null");
		}catch(Exception eee)
		{
			System.out.println(eee.getMessage());
		}
		finally
		{
			System.out.println("Final method");
		}
		
	}

}
