package com.bankAccountProjecrt;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount obj=new SavingAccount("accountN0.123", "Saving");
		System.out.println(obj.getAccountName());
		
	//	SavingAccount obj2=new SavingAccount("AcNo.12", "Saving2", 5);
		/*System.out.println(obj2.getBalance());
		System.out.println(obj2.deposit(1000));
		System.out.println(obj2.getBalance());
		System.out.println(obj2.withdraw(15555));
		//System.out.println(obj2.);*/
		CheckingAccount obj2=new CheckingAccount("accNo.122", "Saving");
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		System.out.println(" 1. getAccountNumber\n 2. getAccountName\n 3. getBalance\n 4. withdraw\n 5. deposit\n 6. Exit");
		System.out.print("enter your choice: ");
		int n=sc.nextInt();
		switch(n) {
		case 1:
				System.out.println(obj2.getAccountNumber());
				break;
		case 2:
				System.out.println(obj2.getAccountName());
				break;
		case 3:
				System.out.println(obj2.getBalance());
				break;
		case 4:
				System.out.print("Enter withdraw amount: ");
				int amount=sc.nextInt();
				System.out.println(obj2.withdraw(amount));
				obj2.deductFees();
				break;
		case 5:
				System.out.println("enter deposit amount: ");
				int deposit=sc.nextInt();
				System.out.println(obj2.deposit(deposit));
				obj2.deductFees();
				break;
		case 6:
			   //return;
				System.exit(0);
		}
		//sc.close();
		}
	}
	

}
