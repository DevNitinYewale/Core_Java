package arrays;

import java.util.Scanner;

public class DiagonalAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][3];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 2d array elements: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j)
					sum+=arr[i][j];
			}
		}
		
		System.out.println("Sum of diagonal element's is: "+sum);
		
		/*for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/
	sc.close();	
	}

}
