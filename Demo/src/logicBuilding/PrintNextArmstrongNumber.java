package com.logicBulding;

import java.util.Scanner;

public class PrintNextArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		while(n>0) {
			int n3=n;
			int sum=0;
			while(n3>0) {
				int n1=n3%10;
				sum=sum+(n1*n1*n1);
				n3=n3/10;
			}
			if(sum==n) {
				System.out.println(n);
				break;
			}
			n++;
		}
sc.close();
	}

}