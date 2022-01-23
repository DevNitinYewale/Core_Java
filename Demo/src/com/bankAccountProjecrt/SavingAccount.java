package com.bankAccountProjecrt;

public class SavingAccount extends BankAccount{

	double interestRate;
	
	public SavingAccount(String accountNumber, String accountName,double interestRate ) {
		super(accountNumber, accountName);
		this.interestRate=interestRate;
	}
	
	public double addInterest(double interestRate) {
		interestRate=getBalance()*interestRate/100;
		return interestRate;
	}
	
	public SavingAccount(String accountNumber, String accountName) {
		super(accountNumber, accountName);
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return super.getAccountName();
	}
	
	public String getAccountNumber() {
		return super.getAccountNumber();
	}
	
	public double getBalance() {
		return super.getBalance();
	}
	
	public double deposite(double amount) {
		return super.deposite(amount);
	}
	
	public double withdraw(double amount) {
		return super.withdraw(amount);
	}
	
}