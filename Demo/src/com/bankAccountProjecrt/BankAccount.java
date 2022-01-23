package com.bankAccountProjecrt;

public class BankAccount {

	String accountName,accountNumber;
	static double balance=10000;
	
	public BankAccount(String accountNumber,String accountName) {
		this.accountName=accountName;
		this.accountNumber=accountNumber;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double deposite(double amount) {
		balance+=amount;
		
		return balance;
	}
	
	public double withdraw(double amount) {
		if(amount>balance) {
			System.out.println("insuffecient balance");
		}
		else {
			System.out.println("withdraw successfully...!");
		}
		
		return balance-=amount;
	}
}
