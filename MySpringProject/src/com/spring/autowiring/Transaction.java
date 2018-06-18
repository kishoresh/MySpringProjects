package com.spring.autowiring;

public class Transaction {
	Account acc;
	
	//Default Constructor
	public Transaction() {
		super();
		System.out.println("Default constructor [Transaction] is called.");
	}
	
	//This constructor is introduced to test autowire="constructor" and "autodetected"> 
	public Transaction(Account acc) {
 	   System.out.println("Constructor [Transaction] is called.");
	   this.acc = acc;
	}
	
	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		System.out.println("Setter method setAcc called.");
		this.acc = acc;
	}

	public void transact(){
		System.out.println("Hello " + acc.getAccHolder() + " [A/c : " + acc.getAccno() + ", Bank : " + acc.getBank() + "]" +". Your transaction is being processed.");
	}
	
}
