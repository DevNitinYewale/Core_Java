package com.logicBulding;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows and columns: ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int org[][]=new int[row][col];
		int transpose[][]=new int[row][col];
		
		System.out.println("enter matrix elements: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				org[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<org.length;i++) {
			for(int j=0;j<org.length;j++) {
				transpose[j][i]=org[i][j];
			}
		}
		System.out.println("Original Matrix: ");
		for(int i=0;i<org.length;i++) {
			for(int j=0;j<org.length;j++) {
				System.out.print(org[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose of Matrix:: ");
		for(int i=0;i<transpose.length;i++) {
			for(int j=0;j<transpose.length;j++) {
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
	}

}
