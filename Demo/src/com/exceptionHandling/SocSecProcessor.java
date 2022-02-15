package com.exceptionHandling;

import java.util.Scanner;

/*
 * in given question you did not gave any social security number for comparison 
 * i give my own social security number which is  12345
 * if the user enter social security number 12345 then it print Social number is valid
 * other wise it throw SocSecException and print Invalid Social Security number
 * */

public class SocSecProcessor {
	
	/*
	 * here we create a static boolean method which name is isValid
	 * and it have a one String type parameter
	 * it return true when the you enter Social security number is 12345
	 * otherwise it return false
	 * once it return false the throw custom exception and print  Invalid Social Security number message
	 */
	/*create a method which return type is boolean*/
	
	public static boolean isValid(String ssn) {
		/*here check give Social security number and original social security number is correct or not
		 * if it currect then return true otherwise it return false*/
		if(ssn.equals("12345"))
			return true;
			else
				return false;
	}
	
	/*
	 * main method/ Driver Code
	 * accept Social security number from user
	 * and send it to isValid() method
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		/*accept number*/
		System.out.print("Enter Social Security number: ");
		String number=sc.nextLine();
		
		try {
			/*
			 * here b is boolean type variable it store which boolean value is return the isValid() method */
			boolean b=SocSecProcessor.isValid(number);
			
			/*
			 * if check if b==true if it true then print Social Security number is valid 
			 * otherwise throw exception and print Invalid Social Security number message */
			if(b)
				System.out.println("Social Security number is valid: ");
		
			else
				/*pass Invalid Social Security number this string to SocSecException constructor*/
				throw new SocSecException("Invalid Social Security number");
		
		} catch (Exception e) {
			// TODO: handle exception
			/*here print message*/
			System.out.println(e);
		}
		
	}

	
		
}
