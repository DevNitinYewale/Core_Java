package com.logicBulding;

public class PascalTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			int cnt=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(cnt+" ");
				cnt=cnt*(i-j)/j;
			}
			System.out.println();
		}
		
	}

}
