package com.staticNestedClass;

public class NestedNonStaticClass {

	void outerDisplay() {
		System.out.println("I am outerDisplay");
	}

	class InnerDemo{
		void innerClassDisplay() {
			System.out.println("I am innerClassDisplay:");
		}
		
	}
	void display() {
		 InnerDemo id=new InnerDemo();
		id.innerClassDisplay();
		System.out.println("Display ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedNonStaticClass obj=new NestedNonStaticClass();//create instance of outer class
		
		InnerDemo obj2=obj.new InnerDemo();//create instance of inner class which is used for accessing the only inner class methods and variables
		obj.display();
		obj.outerDisplay();
		obj2.innerClassDisplay();//access only inner class method 
	}

}
