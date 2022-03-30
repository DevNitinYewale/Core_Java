package com.string;

import java.util.Scanner;

public class NumberOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=sc.nextLine();
		
		char[] ch=str.toCharArray();
	
		for(int i=0;i<ch.length;i++) {
			int cnt=0,char2=0;
			
			for(int j=0;j<i;j++) {
				
				if(ch[j]==ch[i]) {
					char2++;
					}
			}
				if(char2==0) {
					for(int k=i;k<ch.length;k++) {
						if(ch[k]==ch[i]) {
							cnt++;
						}
					}
					
					System.out.println(ch[i]+" Occure: "+cnt+" times");
				}
			
			}
	
	sc.close();
	}
}