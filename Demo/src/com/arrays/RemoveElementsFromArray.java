package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("how many numbers are you enter in array: ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Enter a number which position you want to remove elements: ");
		int rm=sc.nextInt();
		
		//System.out.println();
		for(int i=rm-1;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		System.out.println("After removing elements array will be: ");
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
