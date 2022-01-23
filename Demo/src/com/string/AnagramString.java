
package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two string: ");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		int len1=str1.length();
		int len2=str2.length();
		if(len1!=len2) {
			System.out.println("String is not Anagram: ");
			return;
		}
		
			int cnt=0;
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
		
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			for(int i=0;i<ch1.length;) {
				if(ch1[i]!=ch2[i]) 
					cnt++;
					break;
			}
			if(cnt==0) 
				System.out.println("String is Anagarm: ");
			else
				System.out.println("String is Not Anagram : ");

	sc.close();
	}

}
