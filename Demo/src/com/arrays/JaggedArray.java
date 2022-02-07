package com.arrays;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {
					{1,2,3},
					{1,5,6,9,8},
					{4,5,9,2},
					{0,1},
					{5}
				};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
