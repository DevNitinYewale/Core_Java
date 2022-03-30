package com.string;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a string: ");
		String str=sc.next();
		String str2="";
		
		for(int i=str.length()-1;i>=0;i--) {
			str2+=str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(str2)) {
			System.out.println("String: "+str+" is palindrome: ");
		}
		else {
			System.out.println("String is not palindrome: ");
		}
		sc.close();
	}

}
