package com.logicBulding;

public class PrintNext20LeapYear {
	public static void main(String[] args) {
		int leap=0,year=2022;
		System.out.println("20 leap year");
		while(leap<=20) {
			if(year%4==0) {
				System.out.print(year+" ");
			leap++;
			}
			year++;
		}
	}
}
