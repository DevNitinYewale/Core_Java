package com.arrays;

import java.util.Scanner;

public class AddNewElementInExistingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("How many numbers are you enter");
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.print("Enter position where you insert a number ");
		int position=sc.nextInt();
		
		System.out.print("Enter a number we want to insert: ");
		int number=sc.nextInt();
			
		for(int i=(n-1);i>position-1;i--) {
			arr[i+1]=arr[i];
		}
		arr[position-1]=number;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
