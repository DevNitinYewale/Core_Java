package com.string;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="A string is a data type used in programming, such as an integer and floating point unit, but is used to";
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your string:");
		String oldString=sc.next();
		System.out.print("Enter String or anything how to replace you your string: ");
		String replaceString=sc.next();
		
		System.out.println("Original String is: ");
		System.out.println(str);
		String strArray[]=str.split(" ");
		
		for(int i=0;i<strArray.length;i++) {
			//System.out.print(strArray[i]+" ");
			
			if(strArray[i].equals(oldString)) {
				strArray[i]=replaceString;
				//System.out.println("old"+oldString);
			}
		}
		String s3="";
		System.out.println("New String: ");
		for(int i=0;i<strArray.length;i++) {
			s3=s3+" "+strArray[i];
			System.out.print(strArray[i]+" ");
		}
		System.out.println();
		System.out.println("S3: "+s3);
	sc.close();
	}

}
