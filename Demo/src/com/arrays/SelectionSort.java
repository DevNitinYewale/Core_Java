package com.arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,45,5,14,45,10};
		int i,j;
		for(i=0;i<arr.length-1;i++) {
			int min=i;
			for(j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}