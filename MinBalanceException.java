package com.exception;

public class MinBalanceException extends RuntimeException {
	
	@Override
	public String toString()
	{
		return "Should maintain min balance of 5000";
	}

}
