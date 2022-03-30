package com.exceptionHandling.game;

public class LowestNumber extends Exception {
	public LowestNumber(String msg) {
		super(msg);
		System.out.println("Lowest: "+msg);
	}

}
