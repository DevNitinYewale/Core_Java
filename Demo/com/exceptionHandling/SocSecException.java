package com.exceptionHandling;
/*
 * first create a class which is name SocSecException
 * when you create a custom exception then you should extend your class with Exception class
 * then create a constructor and pass it a Sting type of variable
 * super keyword is called super class constructor
 * */

public class SocSecException extends Exception{
	public SocSecException(String err) {
		super(err);
	}
}
