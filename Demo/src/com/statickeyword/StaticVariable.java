package com.statickeyword;

public class StaticVariable {
	static String s1; //static variable
	String s2;	//class variable
	final static double pi=3.14; // constant variable
	
	static {	//static block
			System.out.println("hello");
		}
	public StaticVariable(String s1, String s2) {
		// TODO Auto-generated constructor stub
		this.s1=s1;
		this.s2=s2;
		//System.out.println("s1: "+s1+" s2: "+s2);
	}
	
	void show() {
		System.out.println("s1: "+s1+" s2: "+s2);
	}

	public static void display(){// static method
		System.out.println("s1: "+s1);
	}
	
	public static void main(String[] args) {
		StaticVariable obj1=new StaticVariable("nitin","Yewale");
		obj1.show();
		StaticVariable.display();
		
		StaticVariable obj2=new StaticVariable("at","gh");
		obj2.show();
		obj1.show();
		StaticVariable.display();
	}
}
