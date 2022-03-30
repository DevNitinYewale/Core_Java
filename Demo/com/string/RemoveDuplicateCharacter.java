package com.string;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nitin";
		//1
		/*
		for(int i=0;i<s.length();i++) {
			int cnt=0;
			for(int j=0;j<i;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					cnt++;
					break;
				}
				
			}
			if(cnt==0)
				System.out.print(s.charAt(i));
			
		}*/
		
		//2
		/*
		LinkedHashSet<Character> lhs=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			lhs.add(s.charAt(i));
		}
		for(char c1: lhs) {
			System.out.print(c1);
		}
		*/
		
		//3
		HashSet<Character> hs=new LinkedHashSet<>();
		char ch[]=s.toCharArray();
		for(char x : ch) {
			hs.add(x);
		}
		
		for(char a:hs) {
			System.out.print(a);
		}
		
		
	}

}
