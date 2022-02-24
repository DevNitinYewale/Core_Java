package com.logicBulding;

public class FindFirstAndLastIndex {
	public static void main(String[] args) {
		String str="hello, world";
		System.out.println();
		
		int olast = 0;
		int clast=0;
		
		
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='o') {
					System.out.println("First Index of 'O' Found at "+j+ " position");
					break;
				}
			}
		
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)==',') {
					System.out.println("First Index of ',' Found at "+j+ " position");
					break;
				}
			}
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='o')
				olast=i;
			
			if(str.charAt(i)==',')
				clast=i;
			
		}
		if(olast>-1)
			System.out.println("Last Index of 'O' Found At: "+ olast +" Position ");
		else
			System.out.println("index is not found: ");

		
		if(clast>-1)
			System.out.println("Last Index of ',' Found At: "+ clast +" Position ");
		else
			System.out.println("index is not found: ");
	
	}
}
