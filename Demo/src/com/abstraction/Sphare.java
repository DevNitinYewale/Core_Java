package com.abstraction;

public class Sphare extends Shape {

	@Override
	void area(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void volume(int x, int y, int z) {
		// TODO Auto-generated method stub
		//double volume=4/3*(3.14*(x*x*x));
		System.out.println("volume of shape is: "+(x*y*z));
	}

}
