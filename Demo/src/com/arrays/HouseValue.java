package com.arrays;

import java.util.Scanner;

public class HouseValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House hs=new House();
		Scanner sc=new Scanner(System.in);
		  int userYear = sc.nextInt();
	      int userPrice = sc.nextInt();
	      int userCurrentYear = sc.nextInt();
	    
	      hs.setConstructionYear(userYear);
	      hs.setPurchasePrice(userPrice);
	      hs.calcCurrentValue(userCurrentYear);
	    
	      hs.printInfo();
	}

}
