package com.exceptionHandling.game;

import java.util.Random;

public class MainGame2 {
	 Random rd=new Random();
	 int value=rd.nextInt(100);
	public void guess(int n)throws LowestNumber,GreatestNumber {
		if(n>value) {
			throw new GreatestNumber("number is greatest");
		}
		else if(n<value) {
			throw new LowestNumber("number is lowest");
		}
		else {
			System.out.println("you are won..");
		}
	}
	public static void main(String[] args)throws GreatestNumber,LowestNumber {
		// TODO Auto-generated method stub
		MainGame2 mg2=new MainGame2();
		mg2.guess(101);
		
	}

}
