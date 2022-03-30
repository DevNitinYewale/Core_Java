package com.logicBulding;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a  number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int cnt=i;
			
			for(int j=1;j<=i;j++) {
				System.out.print(cnt+" ");
				cnt=cnt+n-j;
			}
			System.out.println();
		}
sc.close();
	}

}