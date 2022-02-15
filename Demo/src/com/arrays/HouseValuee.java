package com.arrays;

import java.util.Scanner;

/*
 * HouseValue
 * */
public class HouseValuee {
	/*main method*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*create instance of House class*/

		House myHouse=new House();
		
		Scanner scnr=new Scanner(System.in);
		
		  int userYear = scnr.nextInt();
	      int userPrice = scnr.nextInt();
	      int userCurrentYear = scnr.nextInt();
	    
	      myHouse.setConstructionYear(userYear);
	      myHouse.setPurchasePrice(userPrice);
	      myHouse.calcCurrentValue(userCurrentYear);
	      myHouse.printInfo();
	}

}

class House {
	
	private int constructionYear;
	private int currentValue;
	private int purchasePrice;
	
	public int getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	public int getConstructionYear() {
		return constructionYear;
	}
	
	public void setConstructionYear(int constructionYear) {
		this.constructionYear = constructionYear;
	}
		/*calcCurrentValue() method calculate current value of house*/
	public void calcCurrentValue(int currentYear) {
	      double appreciationRate = 0.03;
	      int houseAge = currentYear - constructionYear;
	    
	      // House depreciation formula
	      currentValue = (int)
	         Math.round(purchasePrice * Math.pow((1 + appreciationRate), houseAge));
	   }
	/*printInfo() method for printing all details of house*/
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("House information: ");
		System.out.println("Counstruction Year: "+constructionYear);
		System.out.println("Purchase Price: "+purchasePrice);
		System.out.println("Current Value: "+currentValue);
		
	}

}
