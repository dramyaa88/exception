package com.exception;


class MyClass implements Cloneable
{
		@Override
		protected Object clone() throws CloneNotSupportedException
		{
			return super.clone();
		}
	
}
public class CheckedExceptionDemo {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		MyClass cloned_obj = null;
		try
		{
		cloned_obj = (MyClass)obj.clone();
		
		System.out.println("Hash code of object :"+obj.hashCode());
		System.out.println("Hash code of cloned object " +cloned_obj.hashCode());
		}catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}

}
