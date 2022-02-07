package com.arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,6,5,7,8,9,10,11,15,20};
		int search=20;
		int min=0;
		int max=arr.length-1;
		int mid=(min+max)/2;
		while(min<=max) {
			if(arr[mid]==search) {
				System.out.println("element found at "+mid+" position");
				break;
			}
			else if(arr[mid]>search) {
				max=mid-1;
			}
			else {
				min=mid+1;
			}
			mid=(min+max)/2;
		}
		if(min>max)
			System.out.println("element not found: ");
	}

}