package com.arrays;

import java.util.Scanner;

public class FindShortesNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("how many number's are you enter in array");
		int n=sc.nextInt();
	
		System.out.print("enter "+n+" number");
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int smallest=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest)
				smallest=arr[i];
		}

		System.out.println("Smallest number is: "+smallest);
	sc.close();
	}
}