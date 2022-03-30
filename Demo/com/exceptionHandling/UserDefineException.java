package com.exceptionHandling;

class MyException extends Exception{
    public MyException(String str) {
		// TODO Auto-generated constructor stub
    	super(str);
	}
}
public class UserDefineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=10;
		try {
			
			if(c>1) {
			
			throw new MyException("Divide by zero...");
			}
			else {
				System.out.println("c: "+c);
			}
		} catch (MyException e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
