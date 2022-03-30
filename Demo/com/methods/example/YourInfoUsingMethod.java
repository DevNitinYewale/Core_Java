package com.methods.example;

import java.util.Scanner;

public class YourInfoUsingMethod {
	
	Scanner sc=new Scanner(System.in);
	
	public String displayName() {
		System.out.print("Enter Your First Name: ");
		String fName=sc.next();
		System.out.print("Enter Your Lase Name: ");
		String lName=sc.next();
		
		return fName+"  "+lName;
		//System.out.println("First Name: "+fName+"\nLast Name: "+lName);
	}
	
	public String displayAddress() {
			System.out.print("Enter your address in detail: ");
			String address=sc.next();
		return address;
	}
	
	public String displayEmail() {
		System.out.print("Enter your email: ");
		String email=sc.next();
		System.out.print("Enter Your Contact number: ");
		String contact=sc.next();
		return email+" "+contact;
	}
	
	public String displayQualification(String qualification) {
		return qualification;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		YourInfoUsingMethod info=new YourInfoUsingMethod();
		
		String name=info.displayName();
		String address=info.displayAddress();
		String contact=info.displayEmail();
		System.out.print("enter your qualification: ");
		String education=sc.next();
		String qualification=info.displayQualification(education);
		
		System.out.println();
		System.out.println("Your full name: "+name);
		System.out.println("Your Address: "+address);
		System.out.println("Your Email and Contact Number:  "+contact);
		System.out.println("Your Qualification: "+qualification);
		
	sc.close();
	}

}
