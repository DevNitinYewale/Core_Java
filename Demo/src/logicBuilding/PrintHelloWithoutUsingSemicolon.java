package com.logicBulding;

public class PrintHelloWithoutUsingSemicolon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(System.out.printf("hello world") != null) {} 
		
		String s1="try",s2="rty";
		int n=0;
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int s=s1.length();
		for(int i=0;i<ch1.length;i++) {
			for(int j=0;j<ch2.length;j++) {
				if(ch1[i]==ch2[j]) {
					n++;
				}
			}
		}
		if(n==s)
			System.out.println("Anagram: ");
		else
			System.out.println("Not anagram");
	}

}
