package com.spring.aop.aspectj;

public class InsufficientBalaanceException extends Throwable {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public InsufficientBalaanceException(double bal){
		this.balance = bal;		
	}
	
	public void doSomethingWithTheError(){
		System.out.println("We got the InsufficientBalaanceException. Need to do something.");
	}
	
}
