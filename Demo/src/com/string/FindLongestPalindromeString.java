package com.string;

public class FindLongestPalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="madam likes oppoppo music";
		String str[]=str1.split(" ");
		
		String s2="";
		for(int i=0;i<str.length;i++)
		{
			String palindrome=str[i];
			String p="";
			for(int k=palindrome.length()-1;k>=0;k--) 
			{
				p+=palindrome.charAt(k);;
			}
			
			if(palindrome.equals(p)) 
			{
				
				if(palindrome.length()>s2.length()) 
					s2=palindrome;
			}
		
		}
		System.out.println("Longest Palindrome String is:= "+s2);
	 }
		
}
