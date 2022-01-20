package com.logicBulding;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number,z=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		number=sc.nextInt();
		
		for(int i=1;i<=number;i++) 
		{
			for(int j=1;j<=z;j++)
			{
				System.out.print("*");
			}
			z+=2;
			
			System.out.println();
		}
		
		z=number+(number-3);
		
		for(int i=1;i<number;i++)
		{
			for(int k=1;k<=z;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			z-=2;
		}
		sc.close();
   }

}
