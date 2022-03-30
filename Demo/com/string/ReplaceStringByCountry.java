package com.string;

import java.util.Scanner;

public class ReplaceStringByCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="India Us America Austrolia China Europe";
		
		String countryArray[]=str.split(" ");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String here: ");
		String str1=sc.nextLine();
		
		System.out.println(str1);
		String str1Arr[]=str1.split(" ");
		
		
		String s2="",n2="";
		
		for(int i=0;i<str1Arr.length;i++) 
		{
			for(int j=0;j<countryArray.length;j++) 
			{
				if(str1Arr[i].equalsIgnoreCase(countryArray[j])) 
				{
					String found=countryArray[j];
					
					for(int k=0;k<found.length();k++) 
					{
						n2=String.valueOf(found.charAt(k));
						
						s2+=n2.replace(n2,"*");
						
					}
						str1Arr[i]=s2;
						s2="";
				}
			}
		}
		
		for(int j=0;j<str1Arr.length;j++) {
			System.out.print(str1Arr[j]+" ");
		}
	
	sc.close();
	}

}
