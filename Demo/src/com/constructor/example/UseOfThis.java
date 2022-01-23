package com.constructor.example;

public class UseOfThis {
	int x,y;
	String s1,s2;
	public UseOfThis(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public void add() {
		System.out.println(x+y);
	}
	
	public UseOfThis(String s1,String s2) {
		this.s1=s1;
		this.s2=s2;
	}
	
	public void concatinate() {
		System.out.println(s1+s2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseOfThis obj1=new UseOfThis(10, 20);
		obj1.add();
		UseOfThis obj2=new UseOfThis("Edu", "Bridge");
		obj2.concatinate();
		
	}

}
