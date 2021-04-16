package com.exception;

public class HierarchyDemo {
	static void divide() 
	{
		try
		{
			int res = 100/10;
			try
			{
				char c = "".charAt(1);   //StringIndexOutOfBoundsException
//			}catch(StringIndexOutOfBoundsException ee)
//			{
//				System.out.println("String is empty");
//			}
			}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			finally
			{
				System.out.println("Inner Final method");
			}
		}catch(ArithmeticException e)
		{
			System.out.println("Divide by zero");
		}
		
		finally
		{
			System.out.println("Outer Final method");
		}
	}
	
	public static void main(String[] args) {
			divide();
	}
}
