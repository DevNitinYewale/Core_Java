package com.logicBulding;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int alphabet=97;
		for(int i=0;i<n;i++) {
			
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
		for(int i=1;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("  ");
			}
			int x=0;
			for(int k=n-i;k>=1;k--) {
				System.out.print((char) (alphabet+x)+" ");
				x++;
			}
			int z=n-i-2;
			for(int y=n-i-1;y>=1;y--) {
				System.out.print((char)(alphabet+z)+" ");
				z--;
			}
			
			System.out.println();
		}

	}

}
