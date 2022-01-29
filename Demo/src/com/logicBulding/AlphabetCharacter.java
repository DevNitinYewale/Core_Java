package com.logicBulding;

public class AlphabetCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int n1=97;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				//char ch=(char) (n1+j);
				System.out.print((char)(n1+j)+" ");
				
			}
			n1++;
			System.out.println();
		}
	}

}
