package com.string;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		
		int vowel=0,consonants=0;
		String str=sc.next();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u'|| ch=='U') {
				vowel++;
			}
			else {
				consonants++;
			}
		}
		System.out.println("Vowels=: "+vowel);
		System.out.print("Consonants=: "+consonants);
	sc.close();
	}

}
