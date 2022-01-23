package com.statickeyword;

public class DemoStaticNested {

	void outerHello() {
		System.out.println("my class 1");
	}
	
	static class InnerDemo{
		int x=10;
		void innerHello1() {
			DemoStaticNested obj=new DemoStaticNested();
			obj.outerHello();
			System.out.println("My inner class 1");
		}
	}
	
	void demoMethod() {
		System.out.println("inner demo");
	
		InnerDemo obj2=new InnerDemo();
		obj2.innerHello1();
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	DemoStaticNested.InnerDemo obj3=new DemoStaticNested.InnerDemo();
	obj3.innerHello1();
	}

}
