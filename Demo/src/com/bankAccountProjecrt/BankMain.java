package com.bankAccountProjecrt;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount obj=new SavingAccount("accountN0.123", "Saving");
		System.out.println(obj.getAccountName());
		
		SavingAccount obj2=new SavingAccount("AcNo.12", "Saving2", 5);
		System.out.println(obj2.getBalance());
		System.out.println(obj2.deposite(1000));
		System.out.println(obj2.getBalance());
	}

}
