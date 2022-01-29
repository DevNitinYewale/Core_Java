package com.logicBulding;

public class PrintAlphabetInTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=0;i<n;i++) {
			int alphabet=97;
			for(int j=n;j>i;j--) {
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print((char) (alphabet+k)+" ");
			}
			for(int y=i-1;y>=0;y--) {
				System.out.print((char) ((alphabet+y))+" ");
				//System.out.println("haii");
			}
			System.out.println();
		}
	}

}
