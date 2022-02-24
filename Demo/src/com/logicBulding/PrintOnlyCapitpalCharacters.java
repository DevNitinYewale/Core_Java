package com.logicBulding;

import java.util.Scanner;

public class PrintOnlyCapitpalCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			if(Character.isUpperCase(ch))
				System.out.println(ch);
	
		}
	}

}
