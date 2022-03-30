package com.exceptionHandling;

public class FirstException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
			//System.exit(0);
		} catch (ArithmeticException e) {
			
			System.out.println(e);
		}
		finally {
			System.out.println("I am finally block...");
		}
	}

}
