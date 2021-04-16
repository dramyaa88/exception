package com.exception;
import java.util.*;


public class Calc {
	Scanner sc = new Scanner(System.in);
	int nr,dr,res;
	int nums[] = new int[5];
	
	
	
	public void divide()
	{
		System.out.println("Enter the numerator value");
		nr = sc.nextInt();
		System.out.println("Enter the denominator value ");
		dr = sc.nextInt();
		System.out.println("Enter the array values");
		
		
		for(int i=0;i<nums.length;i++)
		{
			nums[i] = sc.nextInt();
		}
		
		try
		{
			res = nr/dr;
			
			System.out.println("Value  "+nums[nr]+" : "+nums[dr]);
			
		}catch(ArithmeticException e)
		{
			System.out.println("Denominator should not be zero");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Array index is out of bound");
		}
		finally
		{
			System.out.println("Final block");
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		Calc obj = new Calc();
		obj.divide();
	}
}
