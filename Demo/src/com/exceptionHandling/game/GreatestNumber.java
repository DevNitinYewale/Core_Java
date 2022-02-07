package com.exceptionHandling.game;

public class GreatestNumber extends Exception {
	public GreatestNumber(String msg) {
		super(msg);
		System.out.println("Greatest: "+msg);
	}
}
