package com.spring.aop.aspectj;

public class Operation {
	
	public void msg(String s){
		System.out.println("Operation.msg() method invoked.");	
	}
	
	public int m(){
		System.out.println("Operation.m() method invoked.");
		return 2;
	}

	public int k(){
		System.out.println("Operation.k() method invoked.");
		return 3;
	}
	
	@LogExecutionTime
	public int j() throws InterruptedException{
		System.out.println("Operation.j() method invoked");
		Thread.sleep(1000);	
		return 4;
	}
	
	public void myThrowableMethod() throws InsufficientBalaanceException{
		System.out.println("Inside myThrowableMethod");
		throw new InsufficientBalaanceException(100.00);
	}

}
