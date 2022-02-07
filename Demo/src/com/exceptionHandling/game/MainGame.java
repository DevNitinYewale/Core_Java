package com.exceptionHandling.game;

import java.util.Random;
import java.util.Scanner;

public class MainGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int value=rd.nextInt(100);
		System.out.println(value);
		
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		
		try {
		if(n>value) {
			throw new GreatestNumber("number is greate"); 
		}
		else if(n<value) {
			throw new LowestNumber(" number is lowest:");
		}
		else {
			System.out.println("You are won...");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		sc.close();
	}

}