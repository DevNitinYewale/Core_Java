package com.logicBulding;

import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//String s=sc.nextLine();
		
		StringBuilder s1=new StringBuilder("ght");
		
		for(int i=0;i<2;i++) {
			Character ch=s1.charAt(i);
			if(ch=='g' || ch=='h') {
				//continue;
			}
			else {
				s1.deleteCharAt(i);
			}
				
		}
		System.out.println(s1);
	}

}
