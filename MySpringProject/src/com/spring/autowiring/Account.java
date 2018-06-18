package com.spring.autowiring;

public class Account {
	private int accno;
	private String AccHolder;
	private String Bank;
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccHolder() {
		return AccHolder;
	}
	public void setAccHolder(String accHolder) {
		AccHolder = accHolder;
	}

	public String getBank() {
		return Bank;
	}
	
	public void setBank(String bank) {
		Bank = bank;
	}
	
	//Constructor - 1
	public Account(int accno) {
		this.accno = accno;
		System.out.println("Constructor [Account] - 1 is invoked.");
	}
	
	//Constructor - 2
	public Account(int accno, String accHolder) {
		this.accno = accno;
		this.AccHolder = accHolder;
		System.out.println("Constructor [Account] - 2 is invoked.");
	}
	
	//Constructor - 3
	public Account(int accno, String accHolder, String bank) {
		this.accno = accno;
		this.AccHolder = accHolder;
		this.Bank = bank;
		System.out.println("Constructor [Account] - 3 is invoked.");
	}	
	
	//Constructor - 4 (same as Constructor-2 but argument place is altered
	public Account(String accHolder, int accno) {
		this.AccHolder = accHolder;
		this.accno = accno;	
		System.out.println("Constructor [Account] - 4 is invoked.");
	}

	//Constructor - 5  Duplicate method error. So we cannot create overloaded method with the same argument type.   
/*	public Account(int accno, String bank, String accHolder) {
		this.accno = accno;
		this.AccHolder = accHolder;
		this.Bank = bank;		
	}	*/
	
	public void withdraw(){
		System.out.println("Welcome " + getAccHolder() + " Your Account No is " + getAccno());
	}
}
