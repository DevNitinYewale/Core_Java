package com.logicBulding;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,flag=0;
		System.out.print("Enter a Number: ");
		number=sc.nextInt();
		int mid=number/2;
		for(int i=2;i<mid;i++) {
			if(number%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(number+": is prime Number");
		else
			System.out.println(number+":  is not prime Number ");
	sc.close();	
	}
}
