package com.logicBulding;

public class DaimondPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int i,j,z=1;
	for(i=1;i<=n;i++) {
			for(j=n;j>i;j--) {
				System.out.print("  ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k+" ");
			}
			for(int y=2;y<=z;y++) {
				System.out.print(y+" ");
			}
			z++;
			System.out.println();
		}

	}
}
