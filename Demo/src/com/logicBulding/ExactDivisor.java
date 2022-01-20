package com.logicBulding;

import java.util.Scanner;

public class ExactDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number,first,last,cnt=0,divisor=0;
		
		System.out.print("How many exact divisiors are you find: ");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		System.out.println("Enter range here: ");
		System.out.print("Enter start number: ");
		first=sc.nextInt();
		System.out.print("Enter end number: ");
		last=sc.nextInt();
		
		for(int i=first;i<=last;i++) {
			int dummy=i;
			divisor=0;
			for(int j=1;j<=dummy;j++) {
				if(i%j==0) {
					divisor++;
				}
			}
			if(divisor==number) {
				cnt++;
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\ntotal count is: "+cnt);
		
	sc.close();
	}

}