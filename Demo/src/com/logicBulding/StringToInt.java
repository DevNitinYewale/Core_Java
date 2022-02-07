package com.logicBulding;

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two String in numeric format: ");
		String s1=sc.next();
		String s2=sc.next();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		System.out.println((n1*n2));
		
		sc.close();
	}

}
