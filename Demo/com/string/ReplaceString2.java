package com.string;

public class ReplaceString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n="nitin",n2,s2="";
		
		for(int i=0;i<n.length();i++) {
		
			n2=String.valueOf(n.charAt(i));
			System.out.println("n2: "+n2);
			s2+=n2.replace(n2, "*");
		}
		
		System.out.println(s2);
	}

}


/*
package com.string;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class ReplaceStringByCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="India Us America Australia China Europe";
		
		String str2[]=str.split(" ");
		
		Scanner sc=new Scanner(System.in);
		String str1="I am from india a";//sc.next();
		
		String str1Arr[]=str1.split(" ");
		
		
		String s2="",n2="";
		for(int i=0;i<str1Arr.length;i++) {
			for(int j=0;j<str2.length;j++) {
				if(str1Arr[i].equalsIgnoreCase(str2[j])) {
					String n=str2[j];
					System.out.println("str found: "+n);
					for(int k=0;k<n.length();k++) {
						
						n2=String.valueOf(n.charAt(k));
						System.out.println("n2: "+n2);
						s2+=n2.replace(n2, "*");
					}
					
					str1Arr[i]=s2;
				}
			}
		}
		
		for(int j=0;j<str1Arr.length;j++) {
			System.out.print(str1Arr[j]+" ");
		}
	
	sc.close();
	}

}
*/