package com.exceptionHandling;

import java.util.Scanner;

class Traingle extends Exception{
	String msg;
	public Traingle(String msg) {
		System.out.println(msg);
	}
}

public class ValidTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			int C=sc.nextInt();
			int angle=A+B+C;
			
			try {
			
			if(angle==180)
				System.out.println("YES");
			else 
				throw new Traingle("TraingleNotValid");
		}
		catch(Traingle t){
			
		   }
		   T--;
		}
		
		sc.close();
	}

}