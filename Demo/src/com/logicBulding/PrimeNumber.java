package com.logicBulding;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,flag=0;
		System.out.print("Enter a Number: ");
		number=sc.nextInt();
		for(int i=2;i<number/2;i++) {
			if(number%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(number+": Number is prime");
		else
			System.out.println(number+": Number is not prime ");
	sc.close();	
	}
}
