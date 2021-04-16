package com.exception;

public class AccountTranscation {
	
	int balance = 25000;
	int withdrawAmount = 23000;
	
	public void withdraw()
	{
		balance = balance - withdrawAmount;
		if(balance<5000)
		{
			throw new MinBalanceException();
		}
	}
	
	public static void main(String[] args) {
		try
		{
			new AccountTranscation().withdraw();
		}catch(MinBalanceException e)
		{
			System.out.println(e.toString());
		}
	}

}
